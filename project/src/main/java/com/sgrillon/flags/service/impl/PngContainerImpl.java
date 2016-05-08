/* Copyright (c) 2016 Stéphane GRILLON https://github.com/sgrillon14/flags-rest-service
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the <organization> nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.sgrillon.flags.service.impl;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.apache.batik.transcoder.SVGAbstractTranscoder;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.sgrillon.flags.service.PngContainer;

/**
 * 
 * @author sgrillon
 *
 */
@Component
public class PngContainerImpl implements PngContainer {

    private static final Logger LOGGER = LoggerFactory.getLogger(PngContainerImpl.class);

    private byte[] pngContent;

    private HttpStatus errorCode;

    @Override
    public void convertSvgToPng(String countryCode, int width, int height) {

        LOGGER.debug("convertSvgToPng : countryCode[{}], width[{}], height[{}]", countryCode, width, height);

        // Create a PNG transcoder
        PNGTranscoder pngTranscoder = new PNGTranscoder();

        // Set transcoding option
        try {
            pngTranscoder.addTranscodingHint(SVGAbstractTranscoder.KEY_WIDTH, (float) width);
            pngTranscoder.addTranscodingHint(SVGAbstractTranscoder.KEY_HEIGHT, (float) height);
        } catch (IllegalArgumentException e) {
            LOGGER.error(
                    "Exception caught during the conversion svg to png : illegal arg for width (int >= 0) or height (int >= 0)",
                    e);
            pngContent = null;
            errorCode = HttpStatus.BAD_REQUEST;
            return;
        }

        // Create the transcoder input
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream;
        TranscoderInput input;
        inputStream = classLoader.getResourceAsStream(this.convertCountryCodeToPartialPath(countryCode));
        if (inputStream == null) {
            LOGGER.error("Exception caught during the conversion svg to png : countryCode {} doesn't match", countryCode);
            pngContent = null;
            errorCode = HttpStatus.NOT_FOUND;
            return;
        }
        input = new TranscoderInput(inputStream);

        // Create the transcoder output.
        ByteArrayOutputStream ostream = new ByteArrayOutputStream();
        TranscoderOutput output = new TranscoderOutput(ostream);

        // Save the image.
        try {
            pngTranscoder.transcode(input, output);
        } catch (TranscoderException e) {
            LOGGER.error("Exception caught during the conversion svg to png", e);
            pngContent = null;
            errorCode = HttpStatus.NOT_FOUND;
            return;
        }

        pngContent = ostream.toByteArray();
        errorCode = HttpStatus.OK;
    }

    @Override
    public byte[] getPngContent() {
        LOGGER.debug("getPngContent");
        return pngContent == null ? null : pngContent.clone();
    }

    @Override
    public HttpStatus getErrorCode() {
        LOGGER.debug("getErrorCode");
        return errorCode;
    }

    private String convertCountryCodeToPartialPath(String countryCode) {
        return "svg/" + countryCode + ".svg";
    }
}

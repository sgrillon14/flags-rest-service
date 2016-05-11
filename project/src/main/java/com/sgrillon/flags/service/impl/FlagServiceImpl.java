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

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sgrillon.flags.service.ConverterService;
import com.sgrillon.flags.service.FlagService;
import com.sgrillon.flags.service.PngContainer;

/**
 * 
 * @author sgrillon
 *
 */
@Component
public class FlagServiceImpl implements FlagService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlagServiceImpl.class);

    @Autowired
    private ConverterService converterService;

    @Override
    public String getSvgFlag(String countryAlpha2Code) {
        LOGGER.debug("getSvgFlag : countryAlpha2Code[{}]", countryAlpha2Code);
        return this.getSvgContent(countryAlpha2Code);
    }

    @Override
    public PngContainer getPngFlag(String countryAlpha2Code, int width, int height) {
        LOGGER.debug("getPngFlag : countryAlpha2Code[{}], width[{}], height[{}]", countryAlpha2Code, width, height);
        return converterService.svg2png(countryAlpha2Code, width, height);
    }

    protected String getSvgContent(String countryAlpha2Code) {
        LOGGER.debug("getSvgContent : countryAlpha2Code[{}]", countryAlpha2Code);
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream input = classLoader.getResourceAsStream(this.convertCountryCodeToPartialPath(countryAlpha2Code));
        try {
            if (input == null) {
                return null;
            }
            byte[] encoded = IOUtils.toByteArray(input);
            input.close();
            return new String(encoded, "UTF-8");
        } catch (IOException e) {
            LOGGER.error("Exception caught during getting svg content", e);
            return null;
        }
    }

    private String convertCountryCodeToPartialPath(String countryCode) {
        return "svg/" + countryCode + ".svg";
    }

}

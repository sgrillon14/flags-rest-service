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
package com.sgrillon.flags.rest;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sgrillon.flags.model.Country;
import com.sgrillon.flags.service.CountryService;
import com.sgrillon.flags.service.FlagService;

/**
 * 
 * @author sgrillon
 *
 */
@Controller
public class FlagsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlagsController.class);

    @Autowired
    private CountryService countryService;

    @Autowired
    private FlagService flagService;

    /**
     * 
     * @param lang
     * @return all countries (Code ISO 3166-1 numerical, Code ISO 3166-1 alpha2, Code ISO 3166-1 alpha3, label of country) in a list.
     */
    // @CrossOrigin(origins = "http://localhost:9000")
    @CrossOrigin
    @RequestMapping(value = "/countries", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Country> getCountries(@RequestParam(value = "lang", defaultValue = "en") String lang) {
        LOGGER.debug("Get countries:  lang[{}]", lang);
        return countryService.getAll(lang);
    }

    /**
     * 
     * 
     * @param countryAlpha2Code
     * @return content of SVG picture (String)
     */
    // @CrossOrigin(origins = "http://localhost:9000")
    @CrossOrigin
    @RequestMapping(value = "/{countryAlpha2Code}", method = RequestMethod.GET, produces = "image/svg+xml")
    public ResponseEntity<String> getFlag(@PathVariable String countryAlpha2Code) {
        LOGGER.debug("getFlag : countryAlpha2Code[{}]", countryAlpha2Code);
        String flag = flagService.getSvgFlag(countryAlpha2Code);
        return Optional.ofNullable(flag).map(result -> new ResponseEntity<>(result, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }

}

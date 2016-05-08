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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sgrillon.flags.model.Country;
import com.sgrillon.flags.model.Flag;
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

    //@CrossOrigin(origins = "http://localhost:9000")
    @CrossOrigin
    @RequestMapping("/countries")
    public @ResponseBody List<Country> flags(@RequestParam(value="lang", defaultValue="en") String lang) {
        LOGGER.debug("Get flags:  lang[{}]", lang);
        return countryService.getAll(lang);
    }

    //@CrossOrigin(origins = "http://localhost:9000")
    @CrossOrigin
    @RequestMapping("/flags/{name}")
    public @ResponseBody Flag flag(@PathVariable String name, @RequestParam(value="lang", defaultValue="en") String lang) {
        Flag flag = new Flag();
        flag.setNum(250);
        flag.setAlpha2("FR");
        flag.setAlpha3("FRA");
        flag.setLabel("France");
        flag.setSvg(flagService.getSvgFlag("FR"));
        return flag;
    }

}

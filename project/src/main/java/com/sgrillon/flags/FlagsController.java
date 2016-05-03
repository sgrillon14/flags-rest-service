package com.sgrillon.flags;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author sgrillon
 *
 */
@Controller
public class FlagsController {

    @CrossOrigin(origins = "http://localhost:9000")
    @RequestMapping("/flags")
    public @ResponseBody List<String> flags() {
        List<String> countries = new ArrayList<>();
        countries.add("Brazil");
        countries.add("France");
        return countries;
    }
    
    @CrossOrigin(origins = "http://localhost:9000")
    @RequestMapping("/flags/{name}")
    public @ResponseBody Flag flag(@PathVariable String name) {
        Flag flag = new Flag();
        flag.setNum(250);
        flag.setAlpha2("FR");
        flag.setAlpha3("FRA");
        flag.setLabel("France");
        flag.setSvg("");
        return flag;
    }
    
    @CrossOrigin(origins = "http://localhost:9000")
    @RequestMapping("/flags/{lang}/{name}")
    public @ResponseBody Flag flag(@PathVariable String lang, @PathVariable String name) {
        Flag flag = new Flag();
        flag.setNum(250);
        flag.setAlpha2("FR");
        flag.setAlpha3("FRA");
        flag.setLabel("France");
        flag.setSvg("");
        return flag;
    }

}

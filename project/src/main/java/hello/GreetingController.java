package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
public class flagsController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @CrossOrigin(origins = "http://localhost:9000")
    @RequestMapping("/flags")
    public @ResponseBody flags flags(@RequestParam(required=false, defaultValue="World") String name) {
        System.out.println("==== in flags ====");
        return new flags(counter.incrementAndGet(), String.format(template, name));
    }

}

package com.sgrillon;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlagsController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/flags")
    public Flags greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Flags(counter.incrementAndGet(),
                            String.format(template, name));
    }
}

package com.srini.spring.sample.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public Greet sayHello() {
        Greet g = new Greet();
        g.setGreet("Hello");
        return g;
    }
}

package com.laibao.micronaut.spring.app.controller;

import com.laibao.micronaut.spring.app.domain.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloWorld")
    public Data helloWorld() {
        return new Data("Hello World!");
    }
}

package com.laibao.micronaut.spring.app.controller;

import com.laibao.micronaut.spring.app.domain.Greeting;
import com.laibao.micronaut.spring.app.service.GreetingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Pattern;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

//    @GetMapping("/greeting")
//    public Greeting greeting(@RequestParam(value="name", required = false, defaultValue="World") String name) {
//        return new Greeting(1,name);
//    }

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return greetingService.greeting(name);
    }

    @PostMapping("/greeting")
    public Greeting greetingByPost(@RequestBody Greeting greeting) {
        return greetingService.greeting(greeting.getContent());
    }

    @DeleteMapping("/greeting")
    public ResponseEntity<?> deleteGreeting() {
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("Foo", "Bar");
        return new ResponseEntity<>(headers, HttpStatus.NO_CONTENT);
    }


    @GetMapping("/greeting-status")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Greeting greetingWithStatus(@RequestParam(value="name", defaultValue="World") @Pattern(regexp = "\\D+") String name) {
        return greetingService.greeting(name);
    }

    @GetMapping(value = "/", produces = "text/html")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Micronaut for Spring");
        return "home";
    }
}

package com.laibao.micronaut.spring.app.service;

import com.laibao.micronaut.spring.app.domain.Greeting;

import java.util.Optional;

public interface GreetingService {
    Greeting greeting(String name);
    Optional<Greeting> getLastGreeting();
}

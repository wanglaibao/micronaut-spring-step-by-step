package com.laibao.micronaut.spring.app.service.impl;

import com.laibao.micronaut.spring.app.configuration.GreetingConfiguration;
import com.laibao.micronaut.spring.app.domain.Greeting;
import com.laibao.micronaut.spring.app.service.GreetingService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

@Service
@Validated
public class GreetingServiceImpl implements GreetingService {

    private final AtomicLong counter = new AtomicLong();

    private final GreetingConfiguration greetingConfiguration;

    private AtomicReference<Greeting> lastGreeting = new AtomicReference<>();

    public GreetingServiceImpl(GreetingConfiguration greetingConfiguration) {
        this.greetingConfiguration = greetingConfiguration;
    }

    public Greeting greeting(String name) {
        final Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(greetingConfiguration.getTemplate(), name));
        lastGreeting.set(greeting);
        return greeting;
    }

    public Optional<Greeting> getLastGreeting() {
        return Optional.ofNullable(lastGreeting.get());
    }
}

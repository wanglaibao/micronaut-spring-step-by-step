package com.laibao.micronaut.spring.app.Job;

import com.laibao.micronaut.spring.app.domain.Greeting;
import com.laibao.micronaut.spring.app.service.GreetingService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GreetingJob {

    private final GreetingService greetingService;

    public GreetingJob(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Scheduled(fixedDelayString = "30s")
    void printLastGreeting() {
        final Optional<Greeting> lastGreeting = greetingService.getLastGreeting();
        lastGreeting.ifPresent(greeting -> System.out.println("Last Greeting was = " + greeting.getContent()));
    }
}

package com.laibao.micronaut.spring.app;

import io.micronaut.runtime.Micronaut;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicronautSpringDemoApplication {
    public static void main(String... args) {
        Micronaut.run(MicronautSpringDemoApplication.class);
    }
}

package com.laibao.micronaut.spring.app.domain;

public class Data {
    private final String message;

    public Data(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

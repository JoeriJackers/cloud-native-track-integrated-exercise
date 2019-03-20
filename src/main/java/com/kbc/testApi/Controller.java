package com.kbc.testApi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class Controller {
    @Value("${env}")
    private String env;

    @GetMapping
    public String helloWorld() {
        return "This is running in the " + env.toUpperCase() + " pillar";
    }
}

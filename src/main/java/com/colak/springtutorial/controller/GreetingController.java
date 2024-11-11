package com.colak.springtutorial.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/greeting")
public class GreetingController {

    @Value("${spring.datasource.username:default-username}")
    private String dbUsername;

    @Value("${spring.datasource.password:default-password}")
    private String dbPassword;

    // http://localhost:8080/api/greeting/greet
    @GetMapping("/greet")
    String greet() {
        return "dbUsername : " + dbUsername + " dbPassword: " + dbPassword;
    }
}

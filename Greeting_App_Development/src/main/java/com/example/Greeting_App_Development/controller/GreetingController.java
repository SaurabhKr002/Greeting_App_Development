package com.example.Greeting_App_Development.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public String getGreeting() {
        return "{\"message\": \"Hello, Welcome to Greeting App!\"}";
    }

    @PostMapping
    public String postGreeting() {
        return "{\"message\": \"Greeting has been posted successfully!\"}";
    }

    @PutMapping
    public String putGreeting() {
        return "{\"message\": \"Greeting has been updated!\"}";
    }

    @DeleteMapping
    public String deleteGreeting() {
        return "{\"message\": \"Greeting has been deleted!\"}";
    }
}

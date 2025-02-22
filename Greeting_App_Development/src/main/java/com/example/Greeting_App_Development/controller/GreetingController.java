package com.example.Greeting_App_Development.controller;

import com.example.Greeting_App_Development.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    // Constructor-based dependency injection
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public String getGreeting() {
        return "{\"message\": \"" + greetingService.getGreetingMessage() + "\"}";
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

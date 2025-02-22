package com.example.Greeting_App_Development.controller;

import com.example.Greeting_App_Development.model.User;
import com.example.Greeting_App_Development.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    // GET request - Default greeting
    @GetMapping
    public String defaultGreeting() {
        return "{\"message\": \"Hello, Welcome to Greeting App!\"}";
    }

    // POST request - Personalized greeting
    @PostMapping("/message")
    public String getGreeting(@RequestBody User user) {
        return "{\"message\": \"" + greetingService.getGreeting(user) + "\"}";
    }
}

package com.example.Greeting_App_Development.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreetingMessage() {
        return "Hello World";
    }
}

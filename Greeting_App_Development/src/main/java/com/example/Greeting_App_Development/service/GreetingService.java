package com.example.Greeting_App_Development.service;

import com.example.Greeting_App_Development.model.User;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting(User user) {
        String fullName = (user.getFirstName() != null ? user.getFirstName() : "") +
                (user.getLastName() != null ? " " + user.getLastName() : "");
        return "Hello, " + (fullName.trim().isEmpty() ? "Guest" : fullName) + "!";
    }
}

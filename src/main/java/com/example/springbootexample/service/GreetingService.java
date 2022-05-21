package com.example.springbootexample.service;

import com.example.springbootexample.model.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getMessages() {
        return "Hello World";
    }

    public String getGreetingMessage(String fName, String lName) {
        return "Hello "+fName+""+lName;
    }
    public String postMessage(String fName,String lName) {
        return "Hello "+fName+""+lName;
    }
}


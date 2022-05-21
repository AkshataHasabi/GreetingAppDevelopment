package com.example.springbootexample.controller;

import com.example.springbootexample.model.Greeting;
import com.example.springbootexample.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingAppController {
    @Autowired
    private GreetingService greetingService;

    @PostMapping("/postm")
    public ResponseEntity<String> getGreetingMessage(){
        return new ResponseEntity<String>(greetingService.getMessages(),HttpStatus.OK);
    }

}

package com.example.springbootexample.controller;

import com.example.springbootexample.model.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello From Bridgelabz";
    }


}

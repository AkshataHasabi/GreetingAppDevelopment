package com.example.springbootexample.controller;

import com.example.springbootexample.model.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template="Hello %s";
    private static AtomicInteger counter=new AtomicInteger();
    @GetMapping("/hello")
    public String hello(){
        return "Hello From Bridgelabz";
    }

    @GetMapping("/getmessage")
    public Greeting getMessage(@RequestParam(value="name",defaultValue="World") Greeting greeting) {
        return new Greeting(counter.incrementAndGet(), String.format(template, greeting.getMessage()));
    }

    @PostMapping("/post")
    public String sayHelloPost(@RequestBody Greeting greeting){
        return "Hello"+" "+greeting.getMessage()+"!";
    }

    @PostMapping("/postMessage")
    public ResponseEntity<String> getGreeting(@RequestBody Greeting greeting){
        return new ResponseEntity<String>(greeting.getMessage(), HttpStatus.OK);
    }

    @PostMapping ("/postMessage1")
    public Greeting addGreeting(@RequestBody Greeting greeting){
        return new Greeting(counter.incrementAndGet(),String.format(template, greeting.getMessage(), HttpStatus.OK));
    }

    @PutMapping("/putMessage")
    public Greeting editGreeting(@RequestBody Greeting greeting){
        return new Greeting(counter.incrementAndGet(),String.format(template, greeting.getMessage(), HttpStatus.OK));
    }

}

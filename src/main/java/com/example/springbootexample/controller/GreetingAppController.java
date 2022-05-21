package com.example.springbootexample.controller;

import com.example.springbootexample.model.Greeting;
import com.example.springbootexample.model.User;
import com.example.springbootexample.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingAppController {
    @Autowired
    private GreetingService greetingService;

    @PostMapping("/postm")
    public ResponseEntity<String> getGreetingMessage(){
        return new ResponseEntity<String>(greetingService.getMessages(),HttpStatus.OK);
    }

    @GetMapping("/getGreetingMessage3")
    public ResponseEntity<String>getGreetingMessage(@RequestParam(value="fName",defaultValue="World") String fName, @RequestParam(value="lName",defaultValue="") String lName){
        return new ResponseEntity<String>(greetingService.getGreetingMessage(fName,lName),HttpStatus.OK);
    }
    @PostMapping("/postusername")
    public ResponseEntity<String> getGreeting(@RequestBody User user){
        return new ResponseEntity<String>(greetingService.postMessage(user.getfName(), user.getlName()),HttpStatus.OK);
    }

}

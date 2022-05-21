package com.example.springbootexample.service;

import com.example.springbootexample.model.Greeting;
import com.example.springbootexample.model.User;
import com.example.springbootexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class GreetingService {
    @Autowired
    private UserRepository repo;
    public String getMessages() {
        return "Hello World";
    }

    public String getGreetingMessage(String fName, String lName) {
        return "Hello "+fName+""+lName;
    }
    public String postMessage(String fName,String lName) {
        return "Hello "+fName+""+lName;
    }

    public Greeting addMessage(Greeting greeting) {
        return repo.save(greeting);
    }

    public List<Greeting> addAllMessages(List<Greeting> greeting) {
        return  repo.saveAll(greeting);
    }

    public Greeting getMessageByID(int id) {
        return repo.findById(id).orElse(null);
    }
}


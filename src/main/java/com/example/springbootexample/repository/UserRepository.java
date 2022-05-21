package com.example.springbootexample.repository;

import com.example.springbootexample.model.Greeting;
import com.example.springbootexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Greeting,Integer> {
}

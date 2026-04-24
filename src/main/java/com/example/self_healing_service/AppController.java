package com.example.self_healing_service;

import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Self-Healing Microservice is running!";
    }
}
package com.example.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.service.HelloService;


@RestController
@RequestMapping("/api")
public class HelloController {
    
    private final HelloService helloService;
    public HelloController(HelloService helloService){
        this.helloService = helloService;
    }
    @GetMapping("/hello")
    public String hello(){
        return helloService.getHello();
    }
    
}
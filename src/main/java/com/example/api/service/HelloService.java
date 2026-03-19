package com.example.api.service;

import org.springframework.stereotype.Service;

import com.example.api.repository.HelloRepository;

@Service
public class HelloService {
    private final HelloRepository helloRepository;

    public HelloService (HelloRepository helloRepository){
        this.helloRepository = helloRepository;
    }
    
    public String getHello(){
        return helloRepository.HelloFromRepository();
    }
    
}

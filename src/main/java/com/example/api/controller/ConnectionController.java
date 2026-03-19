package com.example.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.service.ConnectionService;

@RestController
@RequestMapping("/con")
public class ConnectionController {

    private ConnectionService connectionService;

    public  ConnectionController(ConnectionService connectionService){
        this.connectionService = connectionService;
    }
    
    @GetMapping("/test")
    public String testConnectionEndpoint(){
       return connectionService.testConnection();
    }

    
}

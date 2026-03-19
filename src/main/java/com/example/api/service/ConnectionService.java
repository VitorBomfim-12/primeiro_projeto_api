package com.example.api.service;

import java.sql.Connection;

import org.springframework.stereotype.Service;

import com.example.api.repository.ConnectionRepository;

@Service
public class ConnectionService {
    private final ConnectionRepository connectionrepository;

    public ConnectionService(ConnectionRepository connectionRepository){
        this.connectionrepository = connectionRepository;
    }
    
    public String testConnection(){
        Connection connection = connectionrepository.getConnection();
        if (connection != null) {
            return "Conexão bem-sucedida!";
        } else {
           return "Falha na conexão.";
        }
    }
}

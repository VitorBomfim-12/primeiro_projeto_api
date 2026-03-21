package com.example.api.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

    
    public String HelloFromRepository(){
        return "O reposítorio está ativo!";

    }

}

package com.example.api.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.api.model.Transacao;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.api.service.InsertTransaction;


@RestController
@RequestMapping("/api")
public class HelloController {
    
    private final InsertTransaction insertTransaction;

    public HelloController(InsertTransaction insertTransaction){
      this.insertTransaction = insertTransaction;
    }

    @PostMapping("/transacao")
    public void criarTransacao(@RequestBody Transacao transacao){
        insertTransaction.adiciona(transacao);

    
}
}

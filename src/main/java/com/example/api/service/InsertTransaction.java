package com.example.api.service;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.example.api.model.Transacao;
import com.example.api.repository.ConnectionRepository;

@Service
public class InsertTransaction {
    private Connection connection;

     public InsertTransaction(){
        this.connection = new ConnectionRepository().getConnection();
    }
    public void adiciona(Transacao transacao){
        BigDecimal valorZero = new BigDecimal("0.00");
        if(transacao.getValor().compareTo(valorZero)==0 || transacao.getValor().compareTo(valorZero)==-1){
            throw new IllegalArgumentException("Valor da transação deve ser maior que zero.");
        }
        if(transacao.getdataTransacao().isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data da transação não pode ser posterior à data atual.");
        }
        if(transacao.getDescricao().trim().isEmpty()){
            throw new IllegalArgumentException("Descrição da transação é obrigatória.");
        }
        
        String sql = "INSERT INTO transacoes (valor_transacao,data_transacao,descricao_transacao) VALUES (?, ?, ?)";
    try {
        
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setBigDecimal(1,transacao.getValor());
        stmt.setObject(2, transacao.getdataTransacao());
        stmt.setString(3,transacao.getDescricao());
        stmt.execute();
        stmt.close();


        } catch (Exception e)   {
        throw new RuntimeException("Erro ao inserir transação", e);
                                    }
                                                    }
                                        }


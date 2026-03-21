package com.example.api.model;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Transacao {
    private BigDecimal valor;
    private String descricao;
    private LocalDate dataTransacao;

    public Transacao(BigDecimal valor, String descricao, LocalDate dataTransacao) {
        this.valor = valor;
        this.descricao = descricao;
        this.dataTransacao = dataTransacao;
    }
    
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;  
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getdataTransacao(){
        return this.dataTransacao;
    }

    public void setdataTransacao(LocalDate dataTransacao){
        this.dataTransacao = dataTransacao;
    }

   
}
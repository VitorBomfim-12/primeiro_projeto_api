package com.example.api.model;
import java.math.BigDecimal;
import java.time.LocalDate;

public class transacao {
    private BigDecimal valor;
    private String descricao;
    private LocalDate dataTransacao;

    public transacao(BigDecimal valor, String descricao, LocalDate dataTransacao) {
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

    public LocalDate getdataTransaca(){
        return this.dataTransacao;
    }
    
    public void setdataTransaca(LocalDate dataTransacao){
        this.dataTransacao = dataTransacao;
    }

}
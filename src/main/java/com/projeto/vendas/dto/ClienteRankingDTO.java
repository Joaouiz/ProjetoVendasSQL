package com.projeto.vendas.dto;

public class ClienteRankingDTO {

    private String nome;
    private Double totalGasto;

    public ClienteRankingDTO(String nome, Double totalGasto) {
        this.nome = nome;
        this.totalGasto = totalGasto;
    }

    public String getNome() {
        return nome;
    }

    public Double getTotalGasto() {
        return totalGasto;
    }
}
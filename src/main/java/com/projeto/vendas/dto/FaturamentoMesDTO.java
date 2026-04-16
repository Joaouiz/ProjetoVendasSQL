package com.projeto.vendas.dto;

import java.time.LocalDate;

public class FaturamentoMesDTO {
    private LocalDate mes;
    private Double faturamento;

    public FaturamentoMesDTO(LocalDate mes, Double faturamento) {
        this.mes = mes;
        this.faturamento = faturamento;
    }

    public LocalDate getMes() {
        return mes;
    }

    public Double getFaturamento() {
        return faturamento;
    }
}

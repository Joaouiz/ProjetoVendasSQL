package com.projeto.vendas.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;

    private String nome;
    private String email;
    private String cidade;
    private LocalDate data_cadastro;
}

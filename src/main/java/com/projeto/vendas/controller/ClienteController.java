package com.projeto.vendas.controller;

import com.projeto.vendas.dto.*;
import com.projeto.vendas.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping("/relatorios/clientes")
    public List<ClienteRankingDTO> rankingClientes() {
        return service.rankingClientes();
    }

    @GetMapping("/relatorios/faturamento")
    public List<FaturamentoMesDTO> faturamentoMes() {
        return service.faturamentoMes();
    }
}
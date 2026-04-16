package com.projeto.vendas.service;

import com.projeto.vendas.dto.*;
import com.projeto.vendas.repository.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<ClienteRankingDTO> rankingClientes() {

        List<Object[]> resultados = repository.rankingClientes();
        List<ClienteRankingDTO> lista = new ArrayList<>();

        for (Object[] obj : resultados) {
            String nome = (String) obj[0];
            Double total = ((Number) obj[1]).doubleValue();

            lista.add(new ClienteRankingDTO(nome, total));
        }

        return lista;
    }

    public List<FaturamentoMesDTO> faturamentoMes() {

        List<Object[]> resultados = repository.faturamentoMes();
        List<FaturamentoMesDTO> lista = new ArrayList<>();

        for (Object[] obj : resultados) {
            LocalDate mes = (LocalDate) obj[0];
            Double faturamento = ((Number) obj[1]).doubleValue();

            lista.add(new FaturamentoMesDTO(mes, faturamento));
        }

        return lista;
    }
}

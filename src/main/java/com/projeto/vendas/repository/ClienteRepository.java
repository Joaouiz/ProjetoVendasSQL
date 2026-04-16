package com.projeto.vendas.repository;

import com.projeto.vendas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query(value = """
        SELECT c.nome, SUM(p.valor_total) AS total_gasto
        FROM pedidos p
        JOIN clientes c ON p.id_cliente = c.id_cliente
        WHERE p.status = 'FINALIZADO'
        GROUP BY c.nome
        ORDER BY total_gasto DESC
    """, nativeQuery = true)
    List<Object[]> rankingClientes();

    @Query(value = """
    SELECT DATE_TRUNC('month', data_pedido)::DATE AS mes,
    SUM(valor_total) AS faturamento
    FROM pedidos
    WHERE status = 'FINALIZADO'
    GROUP BY mes
    ORDER BY mes;
    """, nativeQuery = true)
    List<Object[]> faturamentoMes();
}

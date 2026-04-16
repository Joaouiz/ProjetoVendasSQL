# Projeto Simulador de Vendas Java, SQL e BigQuery

Neste projeto eu implementei SQL básico tanto em PostgreSQL quanto em BigQuery, com o objetivo de comparar abordagens diferentes que acabam chegando no mesmo resultado.

---

## Sobre o projeto

Ele foi criado com o intuito de me introduzir no mundo de bancos de dados e análise de dados.

Atualmente o sistema simula uma base de vendas simples, onde é possível:

- gerar ranking de clientes com base no valor total gasto  
- calcular o faturamento por mês  
- consultar e estruturar dados de pedidos  

A ideia principal foi entender na prática como um mesmo problema pode ser resolvido tanto em um banco relacional tradicional quanto em um ambiente de análise em nuvem.

---

## Objetivo

- praticar SQL na prática  
- entender consultas analíticas  
- comparar PostgreSQL com BigQuery  
- estruturar um backend simples em Java  
- simular um cenário próximo de um sistema real de vendas  

---

## Tecnologias utilizadas

- Java  
- Spring Boot  
- PostgreSQL  
- BigQuery  
- Maven  
- SQL  

---

## Arquitetura do projeto

O projeto segue uma arquitetura simples em camadas:

- Controller → responsável pelas requisições HTTP  
- Service → regras de negócio  
- Repository → acesso ao banco de dados  
- DTO → estrutura de retorno dos dados  

---

## Funcionalidades implementadas

- Ranking de clientes por valor total gasto  
- Cálculo de faturamento mensal  
- Consultas SQL com agregações e joins  
- Integração com PostgreSQL e BigQuery  
- Validação de consistência entre os dois ambientes  

---

## Observação importante

O mesmo conjunto de dados e consultas foi executado em dois ambientes diferentes:

- PostgreSQL (ambiente local)  
- BigQuery (ambiente em nuvem)  

Isso permitiu comparar sintaxe, performance e comportamento das consultas.

---

## Aprendizados

- escrita de SQL mais analítico (GROUP BY, JOIN, agregações)  
- estruturação de APIs com Spring Boot  
- manipulação de dados vindos do banco em Java  
- diferenças entre bancos relacionais e data warehouse  
- problemas reais de tipos de dados e conversões  

---

## Como executar o projeto

(Adicionar aqui depois os passos de execução do Spring Boot e banco de dados)

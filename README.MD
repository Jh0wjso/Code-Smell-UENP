# Sistema de Locadora - Projeto em Java

## Linguagem de Programação

Este projeto foi desenvolvido em Java.

## Objetivo do Sistema

O objetivo deste sistema é simular um sistema de locadora, onde os usuários podem alugar e devolver filmes, e os funcionários podem registrar devoluções. O sistema também inclui funcionalidades para gerar relatórios de locações e devoluções.

## Funcionamento

O sistema é composto por diversas classes que representam diferentes entidades e funcionalidades:

- `Filme`: Representa um filme com título, ano e status de disponibilidade.
- `Cliente`: Representa um cliente da locadora.
- `Locacao`: Representa uma locação, associando um cliente a um filme e data de locação.
- `Devolucao`: Representa uma devolução, relacionada a uma locação e data de devolução.
- `Funcionario`: Representa um funcionário da locadora com nome e cargo. Ele pode registrar devoluções.
- `Estoque`: Gerencia o estoque de filmes disponíveis na locadora.
- `Relatorio`: Gera relatórios de locações e devoluções.
- `SistemaLocadora`: Ponto de entrada do sistema, contendo um exemplo de uso das classes.

## Refatoração com JDeodorant

O código foi refatorado utilizando a ferramenta de análise de código JDeodorant. Essa ferramenta identifica e auxilia na eliminação de más práticas de programação, como duplicações de código, longos métodos e classes com muitas responsabilidades.

## Executando o Projeto

1. Certifique-se de ter o Java instalado em seu sistema.
2. Compile os arquivos `.java` utilizando um compilador Java.
3. Execute a classe `SistemaLocadora` para testar o funcionamento do sistema.

## Observações

Este é um projeto básico para ilustrar o funcionamento de um sistema de locadora. Em um cenário real, seriam necessárias mais funcionalidades e tratamentos de erros para um sistema completo e robusto.

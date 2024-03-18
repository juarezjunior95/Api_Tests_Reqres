# Testes de API com Rest Assured em Java

![Rest Assured Logo](https://www.pngfind.com/pngs/m/152-1528817_rest-assured-logo-hd-png-download.png)

Este repositório contém testes automatizados de API usando Rest Assured em Java, seguindo o padrão POJO (Plain Old Java Object) para facilitar a escrita e manutenção dos testes. O POJO é utilizado para representar os dados enviados e recebidos nas requisições HTTP, proporcionando uma estrutura mais organizada e legível para os testes.

Os testes são realizados na API open-source do site [ReqRes](https://reqres.in/), utilizando as técnicas CRUD (Create, Read, Update, Delete) para interagir com endpoints e validar as respostas.

## Pré-requisitos
- Java 11 ou superior instalado na máquina.
- Maven para gerenciamento de dependências.

## Dependências
As seguintes dependências estão sendo utilizadas neste projeto:
- [JUnit Jupiter API](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api) - 5.8.0-M1
- [Rest Assured](https://mvnrepository.com/artifact/io.rest-assured/rest-assured) - 4.4.0
- [Jackson Databind](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind) - 2.13.1

Certifique-se de ter essas dependências configuradas corretamente em seu ambiente de desenvolvimento antes de executar os testes.

## Estrutura do Projeto
O projeto está estruturado da seguinte forma:
- **src/main/java/crud**: Contém os testes de API organizados pelo padrão CRUD.
- **src/main/java/org.example.pojo**: Classes POJO para representar dados utilizados nos testes. Por exemplo, a classe `UserPojo` representa os dados de um usuário utilizado nos testes de criação, atualização, etc.

## Como Executar os Testes
1. Clone este repositório em sua máquina local.
2. Abra o projeto em sua IDE preferida (recomendado: IntelliJ IDEA).
3. Certifique-se de ter todas as dependências configuradas corretamente no arquivo `pom.xml`.
4. Execute os testes a partir da classe de teste desejada (`CreateUserTest`, `UpdateUserTest`, etc.).

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues relatando problemas encontrados ou enviar pull requests com melhorias no código ou nos testes.

## Contato
Em caso de dúvidas ou sugestões, entre em contato através do email [juares.franciscodacruz@gmail.com0](mailto:seu-email@example.com).


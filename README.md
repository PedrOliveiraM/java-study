# Spring Boot Application

## Descrição

Este é um projeto exemplo de uma aplicação Spring Boot. Ele demonstra a estrutura básica de um aplicativo Spring Boot, incluindo configuração de dependências, controle de rotas e integração com um banco de dados.

## Requisitos

- **Java 17**
- **Maven** (para gerenciamento de dependências)
- **Spring Boot** versão 3.3.3 ou superior

## Configuração do Projeto

### Dependências

As dependências principais para o projeto estão definidas no arquivo `pom.xml` para projetos Maven. Algumas delas incluem:

- **Lombok**: biblioteca que reduz a verbosidade do código Java, gerando automaticamente getters, setters, construtores e outros métodos utilitários em tempo de compilação.
- **Spring Web**: oferece suporte para desenvolvimento de aplicações web, incluindo RESTful APIs, manipuladores de solicitações e suporte para várias tecnologias de web.
- **MySQL Driver**: driver JDBC necessário para conectar a aplicação Spring Boot a um banco de dados MySQL.
- **Spring Data JPA**: fornece uma abstração sobre o JPA, facilitando o acesso a dados e a criação de repositórios com métodos CRUD prontos, além de suporte a consultas personalizadas.

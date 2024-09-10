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

- **Spring Boot Starter Web**: para criação de aplicações web e APIs REST.
- **Spring Boot Starter Data JPA**: para integração com bancos de dados usando JPA/Hibernate.
- **H2 Database**: banco de dados em memória para desenvolvimento e testes.
- **Lombok**: biblioteca que reduz a verbosidade do código Java, gerando automaticamente getters, setters, construtores e outros métodos utilitários em tempo de compilação.
- **Spring Web**: oferece suporte para desenvolvimento de aplicações web, incluindo RESTful APIs, manipuladores de solicitações e suporte para várias tecnologias de web.
- **MySQL Driver**: driver JDBC necessário para conectar a aplicação Spring Boot a um banco de dados MySQL.
- **Spring Data JPA**: fornece uma abstração sobre o JPA, facilitando o acesso a dados e a criação de repositórios com métodos CRUD prontos, além de suporte a consultas personalizadas.

### Arquivo `pom.xml`:

```xml
<dependencies>
    <!-- Spring Boot Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Data JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- Banco de dados H2 -->
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Spring Boot Test (para testes) -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```

````

### Configurações do Aplicativo

As configurações da aplicação estão no arquivo `application.properties` ou `application.yml`, localizado em `src/main/resources`.

Exemplo de `application.properties`:

```properties
# Configuração do banco de dados H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.h2.console.enabled=true

# Configurações de JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Executando o Projeto

Para rodar o projeto localmente, execute o seguinte comando no terminal:

```bash
./mvnw spring-boot:run
```

Ou você pode construir o projeto em um arquivo `.jar` e executá-lo com:

```bash
./mvnw clean package
java -jar target/nome-do-projeto.jar
```

A aplicação estará disponível em [http://localhost:8080](http://localhost:8080).

### Testes

Este projeto inclui testes unitários usando JUnit e Spring Boot Test. Para executar os testes, use o seguinte comando:

```bash
./mvnw test
```

## Endpoints

Abaixo estão alguns endpoints disponíveis na aplicação:

- **GET** `/api/users`: Retorna todos os usuários.
- **POST** `/api/users`: Cria um novo usuário.
- **GET** `/api/users/{id}`: Retorna um usuário específico pelo ID.
- **PUT** `/api/users/{id}`: Atualiza um usuário existente.
- **DELETE** `/api/users/{id}`: Remove um usuário.

## Estrutura do Projeto

```bash
src
├── main
│   ├── java
│   │   └── com
│   │       └── exemplo
│   │           └── projeto
│   │               ├── controllers
│   │               │   └── UserController.java
│   │               ├── models
│   │               │   └── User.java
│   │               └── repositories
│   │                   └── UserRepository.java
│   └── resources
│       ├── application.properties
│       └── data.sql
└── test
    └── java
        └── com
            └── exemplo
                └── projeto
                    └── UserControllerTest.java
```

## Tecnologias Utilizadas

- **Spring Boot**: Framework principal.
- **Maven**: Gerenciamento de dependências e build.
- **H2 Database**: Banco de dados em memória para desenvolvimento.
- **JUnit 5**: Testes unitários.
- **Thymeleaf**: Template engine para views (caso utilize).

## Contribuição

Sinta-se à vontade para contribuir com o projeto. Basta seguir estas etapas:

1. Faça um fork do projeto.
2. Crie uma branch com sua feature (`git checkout -b minha-feature`).
3. Faça commit das suas alterações (`git commit -m 'Adicionando nova feature'`).
4. Faça push para a branch (`git push origin minha-feature`).
5. Abra um Pull Request.

## Licença

Este projeto é licenciado sob a [MIT License](LICENSE).

```

````

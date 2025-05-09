# 🧊 SmartFridgeAi

**SmartFridgeAi** é uma API REST desenvolvida em Java com Spring Boot, que gerencia alimentos de uma geladeira inteligente e integra-se à Gemini API para sugerir receitas com base nos ingredientes disponíveis.

## 🚀 Funcionalidades

- Cadastro, listagem e remoção de alimentos.
- Sugestão de receitas com base nos itens disponíveis, utilizando a Gemini API.
- Persistência com banco de dados relacional.
- Documentação da API com Swagger/OpenAPI.

## 🛠️ Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL (via Docker)
- Gemini API (Google AI)
- Swagger/OpenAPI
- Docker Compose

## 📦 Como Executar o Projeto

### Pré-requisitos

- Java 17+
- Docker e Docker Compose
- Maven

### Passos

1. Clone o repositório:

    ```bash
   git clone https://github.com/GuilhermeD9/SmartFridgeAi.git
   cd SmartFridgeAi

2. Inicie os serviços com Docker Compose:

  ```bash
  docker-compose up -d
  ```

3. Execute a aplicação:

  ```bash
  ./mvnw spring-boot:run
  ```

4. Acesse a documentação da API em:

  ```bash
  http://localhost:8080/swagger-ui.html
  ```

##📄 Licença
Este projeto está licenciado sob a Licença MIT. Consulte o arquivo LICENSE[license.md] para mais informações.

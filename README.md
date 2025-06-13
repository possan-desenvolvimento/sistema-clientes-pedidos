# 🧩 Cliente Service - Microserviço em Java com Spring Boot

Este projeto é um exemplo simples e prático de um **microserviço em Java**, desenvolvido com **Spring Boot**, que permite o cadastro e consulta de clientes. A aplicação utiliza banco de dados em memória (**H2**) e pode ser facilmente estendida ou integrada a outros serviços (como um microserviço de pedidos, por exemplo).

---

## 📌 Objetivo

Demonstrar, de forma simples, como funciona a estrutura de um **microserviço**, incluindo:

- Criação de uma API com Spring Boot
- Separação em camadas (`controller`, `service`, `repository`)
- Interação com banco de dados (H2)
- Execução via terminal com entrada de dados do usuário
- Isolamento de responsabilidades e facilidade de manutenção

---

## 🧠 O que são Microserviços?

**Microserviços** são uma arquitetura onde a aplicação é dividida em pequenos serviços, **independentes**, **escaláveis** e **focados em uma única responsabilidade**.

### ✅ Vantagens:

- Independência de desenvolvimento e deploy
- Manutenções mais rápidas e seguras
- Escalabilidade individual de cada serviço
- Menor acoplamento entre partes do sistema
- Facilidade de testes e reusabilidade

> Exemplo: Um microserviço de clientes (como este) pode ser usado por um sistema de pedidos, faturamento, CRM etc.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot 3.5
- Spring Data JPA
- Banco de dados H2 (em memória)
- Maven
- Terminal/Console (entrada de dados interativa)

---

## 📁 Estrutura do Projeto

- cliente-service/
- ├── model/ # Classe Cliente (entidade)
- ├── repository/ # Interface ClienteRepository
- ├── service/ # Lógica de negócio (ClienteService)
- ├── controller/ # REST Controller (opcional)
- ├── ClienteTerminalApp # Aplicação interativa via console
- └── ClienteServiceApplication.java

---


---

## ▶️ Como executar

### Pré-requisitos:
- JDK 17 ou superior
- Maven

### Passos:

bash
git clone https://github.com/seu-usuario/cliente-service.git
cd cliente-service
mvn spring-boot:run

---

# A aplicação será executada e exibirá o seguinte menu no console:

==== MENU CLIENTES ====
  1 - Cadastrar novo cliente
  2 - Buscar cliente por ID
  0 - Sair

--- 

🧪 Testando
- Você pode interagir com a aplicação pelo terminal:

- Digite 1 para cadastrar um cliente

- Digite 2 para buscar cliente por ID

- Digite 0 para sair da aplicação

---

# 👨‍💻 Autor
- Leonardo Possan
- Microserviço desenvolvido para estudos e prática com arquitetura moderna em Java.

# 📚 BookSystem - Core (Backend)

Este repositório contém a camada de negócios e persistência de dados do projeto **BookSystem** (Sistema de Gerenciamento de Acervo), refatorado para suportar futuras integrações Web.

## 🎯 Objetivo da Refatoração (Etapa 6)

O sistema original foi desenvolvido em Java Desktop (Swing). O objetivo desta etapa foi aplicar princípios de arquitetura de software para desacoplar a lógica de negócios da interface gráfica, resolvendo problemas de *code smells* (alto acoplamento).

* **SOLID Aplicado:** Princípio da Responsabilidade Única (SRP).
* As classes de acesso a dados agora operam de forma 100% independente, não possuindo referências a bibliotecas visuais (`javax.swing`).
* A arquitetura foi preparada para o modelo MVC/Web.

## ⚙️ Arquitetura e Padrões de Projeto

A estrutura de pacotes foi organizada da seguinte forma:

- `model`: Contém a classe de entidade `Livro` (Padrão DTO), responsável apenas pelo encapsulamento e transporte de dados.
- `dao`: Contém as classes `ConexaoDAO` e `LivroDAO` (Padrão Data Access Object), responsáveis exclusivas pelas transações de banco de dados e controle de exceções.
- `main`: Contém a classe `TesteMain` com testes de integração via console.

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java (JDK 17+)
- **Build Tool:** Ant
- **Banco de Dados:** MySQL
- **Driver de Conexão:** MySQL Connector/J (JDBC)

## 🚀 Como testar a aplicação

1. Clone o repositório em sua máquina.
2. Certifique-se de ter o MySQL rodando na porta `3306`.
3. Execute o script abaixo no seu SGBD para preparar a base de dados:

```sql
CREATE DATABASE booksystem;
USE booksystem;

CREATE TABLE tb_livros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    status VARCHAR(20) DEFAULT 'Disponível'
);

# 📚 OpenLibrary – Consumo de API com Spring Boot

Este projeto é uma aplicação web desenvolvida em **Java 21 com Spring Boot**, cujo objetivo é consumir a API pública do [Open Library](https://openlibrary.org/developers/api) para buscar e exibir livros através de uma interface simples com Thymeleaf.

---

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Web
- Thymeleaf
- Maven

---

## 📁 Estrutura do Projeto

```

openlibrary/
├── src/
│   ├── main/
│   │   ├── java/com/example/openlibrary/
│   │   │   ├── controller/
│   │   │   │   └── BookController.java
│   │   │   ├── model/
│   │   │   │   └── Book.java
│   │   │   ├── service/
│   │   │   │   └── OpenlibraryApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       │   ├── index.html
│   │       │   └── result.html
│   │       └── application.properties
│   └── test/
├── .gitignore
├── pom.xml
├── mvnw / mvnw\.cmd
└── README.md

````

---

## ⚙️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/joaopaes14/API-Biblioetca.git
cd openlibrary
````

2. Compile e execute o projeto:

```bash
./mvnw spring-boot:run
```

3. Acesse o navegador:

```
http://localhost:8080
```

---

## ✨ Funcionalidades

* 🔍 Buscar livros por nome ou autor.
* 📖 Exibir capa, título e dados básicos dos livros.
* 🌐 Interface simples feita com HTML e Thymeleaf.

---


Desenvolvido por João Paes 💻


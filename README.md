
# 📚 Sistema de Gerenciamento de Livros - API REST

Este projeto é uma API REST simples desenvolvida com **Spring Boot**, responsável por gerenciar um catálogo de livros. Ele permite listar, adicionar e remover livros utilizando endpoints RESTful.

## 🚀 Funcionalidades

* ✅ Listar todos os livros
* ✅ Adicionar um novo livro
* ✅ Remover livro por ID

## 🛠 Tecnologias Utilizadas

* Java 17+
* Spring Boot
* Spring Web
* Jakarta Bean Validation (JSR 380)


## 📄 Endpoints da API

### 🔍 Listar livros

**GET** `/livros`

* Retorna a lista de todos os livros cadastrados.
* Se não houver livros, retorna status `204 No Content`.

**Resposta (200 OK)**

```json
[
  {
    "id": "1",
    "titulo": "Dom Casmurro",
    "autor": "Machado de Assis"
  }
]
```

---

### ➕ Adicionar livro

**POST** `/livros`

* Adiciona um novo livro ao sistema.
* Campos obrigatórios: `titulo`, `autor`.

**Corpo da Requisição**

```json
{
  "titulo": "1984",
  "autor": "George Orwell"
}
```

**Resposta (201 Created)**

```json
{
  "id": "2",
  "titulo": "1984",
  "autor": "George Orwell"
}
```

---

### ❌ Remover livro

**DELETE** `/livros/{id}`

* Remove um livro com o ID informado.
* Retorna `204 No Content` em caso de sucesso.

---

## ▶️ Como executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/seuusuario/seu-repositorio.git
   ```
2. Navegue até a pasta do projeto:

   ```bash
   cd seu-repositorio
   ```
3. Execute a aplicação:

   ```bash
   ./mvnw spring-boot:run
   ```


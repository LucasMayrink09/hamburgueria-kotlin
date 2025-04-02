# Hamburgueria Kotlin

## Descrição
Este projeto é um CRUD desenvolvido em Kotlin e Spring Boot para o back-end de uma hamburgueria. Ele segue o modelo MVC e implementa funcionalidades de gestão de pedidos, produtos e clientes, com suporte a validações, tratamento de erros e migrações de banco de dados.

## Tecnologias Utilizadas
- **Kotlin**
- **Spring Boot**
  - Spring Web
  - Spring Data JPA
- **Banco de Dados**: H2 Database
- **Migrations**: Flyway
- **Gerenciamento de Dependências**: Gradle

## Estrutura do Projeto
```
/hamburgueria-kotlin
├── src/main/kotlin
│   ├── controller
│   │   ├── dto
│   ├── domain
│   ├── exception
│   ├── repository
│   │   ├── model
│   ├── server
└── src/main/resources
    ├── db/migration  # Migrations Flyway
    ├── application.properties
```

## Funcionalidades
- CRUD completo para gestão de produtos e pedidos
- Validações de campos
- Tratamento de erros personalizados
- Banco de dados em memória (H2) para desenvolvimento
- Migração de banco de dados com Flyway

## Instalação e Execução
1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/hamburgueria-kotlin.git
   ```
2. Acesse o diretório do projeto:
   ```bash
   cd hamburgueria-kotlin
   ```
3. Configure o banco de dados no `application.properties` (opcional, se quiser mudar o H2 para outro banco):
4. Execute o projeto:
   ```bash
   ./gradlew bootRun  # ou mvn spring-boot:run
   ```

## Endpoints
### Produtos
- **GET** `/produtos` - Lista todos os produtos
- **POST** `/produtos` - Adiciona um novo produto
- **PUT** `/produtos/{id}` - Atualiza um produto existente
- **DELETE** `/produtos/{id}` - Remove um produto

### Pedidos
- **GET** `/pedidos` - Lista todos os pedidos
- **POST** `/pedidos` - Cria um novo pedido
- **PUT** `/pedidos/{id}` - Atualiza um pedido existente
- **DELETE** `/pedidos/{id}` - Remove um pedido

## Testes
Para rodar os testes, utilize:
```bash
./gradlew test  # ou mvn test
```

## Contribuição
Se quiser contribuir, abra um pull request ou entre em contato.

## Autor
[Lucas Mayrink](https://github.com/LucasMayrink09)

## Licença
Este projeto está sob a licença MIT.


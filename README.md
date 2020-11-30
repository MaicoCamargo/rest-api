### Desafio Ténico Compasso UOL
- https://github.com/recrutamento-compasso/spring-boot-interview
### Requisitos para rodar o projeto 
-  Java versão >= 8
- mysql 8.0.22 ou compativel

==================================================================
### Instruções para rodar o projeto
``` git clone https://github.com/MaicoCamargo/rest-api.git ```

``` cd compasso ```

substituir no arquivo application.properties:
 
    - spring.datasource.url: 3306 pela porta do mysql rodando na sua maquina
    - spring.datasource.username: informar o usuario do seu banco de dados
    - spring.datasource.password: informar senha do seu banco de dados

``` ./mvnw spring-boot:run ```

```http://127.0.0.1:8080```

por fim, criar uma base de dados no mysql com nome: compasso

==================================================================

#### Endpoints da aplicação
 - GET /cidade/?estado=
    - 
 - GET /cidade/?nome=
    - http://127.0.0.1:8080/cidade/?nome=Maral
 - POST /cidade
    - contrato: {"nome":"Santa Maria", "estado":"RS"}
 - GET /cliente/{id}
    - http://127.0.0.1:8080/cliente/1
 - GET /cliente/?nome=
    - http://127.0.0.1:8080/cliente/?nome=Ana
 - GET /cliente/?estado= 
    - http://127.0.0.1:8080/cliente/?estado=rs
 - DELETE /cliente/{id}
    - http://127.0.0.1:8080/cliente/1
 - POST /cliente
    - payload: {
                   "nome": " ",
                   "sexo": " ",
                   "dataNascimento": "",
                   "cidade": {
                       "id": 
                   }
               }
   - campo dataNascimento formato "AAAA-MM-DD"
   - campo cidade.id informar o id de uma cidade já criada, valor inteiro 
 - PATCH /cliente/{id}
    - informar o id que deve ter o nome editado
    - payload: { "nome": " " }


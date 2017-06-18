# Projeto Control Robot API

Projeto responsável pelas apis que irão controlar os passos de um robô no território de Marte.

## Tecnologias utilizadas

* Linguagem Java - Versão 1.8 (Oracle 1.8.0_121)

* Spring Boot - Framerwork Web para geração das API's

* Maven 3 - Ferramenta de Build.

Para realizar o CI usei o Travis com a plataforma Pass Heroku para relizar o deploy da API.

Para acessar a serviços usados acione a url (POST) https://control-robot-api.herokuapp.com/rest/mars/${commands}

Payload de retorno:

```
{
    "x": 2,
    "y": 0,
    "orientationInitial": "S"
}
```
## Evidências:

1. Teste no Postman:

https://github.com/ander-f-silva/control-robot-api/wiki/Evid%C3%AAncia-POSTMAN---Teste-sobre-os-servi%C3%A7os

2. Teste no Junit:

https://github.com/ander-f-silva/control-robot-api/wiki/Evid%C3%AAncia-JUNIT---Teste-unit%C3%A1rio

## Gestão do Projeto e técnicas para construção da API

Organizei as atividade usando Kaban com Zenhub e TDD para realizar os testes e construção no design das classes.

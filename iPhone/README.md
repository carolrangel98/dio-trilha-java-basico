# Desafio de Projeto - iPhone

Projeto desenvolvido para o Bootcamp Santander - Back-end JAVA, realizado através da DIO, em 2025.

## Sobre o projeto

Desenvolvimento de simulação de funcionalidades de um aparelho iPhone, utilizando interfaces Java e suas implementações em classes.

## UML do Projeto

```mermaid
classDiagram
    class Iphone {
        +String numero
        +String gender
    }
    class AparelhoTelefonico {
        +String numero
        +ligar(String numero)
        +Atender()
        +iniciarCorreioVoz()
    }
    class ReprodutorMusical {
        +String musica
        +tocarMusica()
        +pausarMusica()
        +selecionarMusica(String musica)
    }
    class NavegadorInternet {
        +String url
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
    
    Iphone <|-- AparelhoTelefonico
    Iphone <|-- ReprodutorMusical
    Iphone <|-- NavegadorInternet
    ```
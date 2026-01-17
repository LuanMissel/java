#   SISTEMA BANCÁRIO

## Descrição

O Sistema Bancário foi feita em java, para mostrar os conceitos básicos da linguagem, como variáveis, operadores, laços de repetição, estruturas condicionais, operadores lógicos, entre outros.
Foram utilizados conceitos de orientação a objetos, como classes, métodos e objetos, encapsulamento, acoplamento, sistemas de validação, entre outros.

## Funcionalidades

- Saque
- Depósito
- Validação de Saldo 
- Tratamento de Dados.

##  Conceitos Aplicados

- **Encapsulamento**: Uso de modificadores privados e métodos getters/setters.
- **Associação**: A classe de Cliente possui uma relação com a classe Cliente.
- **Estruturas de Controle**: Loop `while` para manter o programa rodando e `switch case` para o menu.

## Construção

- Primeiramente, foi criado um projeto no Intellij, com o nome de "Sistema Bancário".
    O projeto foi organizado seguindo boas práticas de pacotes:

    Domain: Contém as classes de negócio (Conta e Cliente) com seus atributos e regras de encapsulamento.

    Test: Contém a classe de execução (SistemaBancarioTest) para simular a interação do usuário com o sistema.
- Dentro do pacote "Domain", foi criado uma classe chamada "Conte" e "Cliente", que contém os atributos e métodos de cada classe.
- Dentro do pacote "Test", foi criado uma classe chamada "SistemaBancarioTest", que contém os testes na classe de execução para os métodos de Saque, depósito e mostrar o saldo na tela.

## Como executar 

- Baixe o compilador do intellij IDEA: https://www.jetbrains.com/idea/download/
- Use o git hub desktop para baixar o projeto na raiz do seu computador.
- Abra o projeto no intellij IDEA.
- Clique no botão "Run" na barra de ferramentas do intellij IDEA.
- O sistema será executada e você poderá usar os métodos de saque, depósito e saldo.


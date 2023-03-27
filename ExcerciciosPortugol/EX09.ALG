Algoritmo "ex09"
// Disciplina  : Lógica de Programação
// Exercício   : ex09
// Descrição   : Receber 2 números inteiros e apresentar a soma, antes de
//apresentar deverá aparecer a mensagem: soma
// Autor(a)    : Leticia Moura Lopes Soares
// Data atual  : 24/02/2023
Var

    num1, num2, soma: inteiro
    soma_texto: caractere

Inicio

    escreval("Informe o primeiro número inteiro")
    leia(num1)
    escreval("Informe o segundo número inteiro")
    leia(num2)
    soma <- num1 + num2
    soma_texto <- "SOMA:"
    escreval(soma_texto)
    escreval(soma )

Fimalgoritmo
Algoritmo "ex14"
// Disciplina  : Lógica de Programação
// Exercício   : ex14
// Descrição   : Entrar com 4 números e imprimir a média ponderada, sabendo
//que os pesos são respectivamente: 1, 2, 3 e 4.
// Autor(a)    : Leticia Moura Lopes Soares
// Data atual  : 24/02/2023
Var

    num1, num2, num3, num4, media, peso1, peso2, peso3, peso4: real

Inicio

    escreval("Informe um número")
    leia(num1)
    escreval("Informe um número")
    leia(num2)
    escreval("Informe um número")
    leia(num3)
    escreval("Informe um número")
    leia(num4)
    
    peso1 <- 1
    peso2 <- 2
    peso3 <- 3
    peso4 <- 4
    
    media <- (num1 * peso1 + num2 * peso2 + num3 * peso3 + num4 * peso4) / 10
    escreval("A média ponderada é", media)
    
Fimalgoritmo
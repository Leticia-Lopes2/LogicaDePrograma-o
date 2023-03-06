Algoritmo "ex25"
// Disciplina  : Lógica de Programação
// Exercício   : ex25
// Descrição   : Entrar com os lados de um paralelepípedo e apresentar a diagona
// Autor(a)    : Leticia Moura Lopes Soares
// Data atual  : 05/03/2023
Var

    a, b, c, soma, diagonal: real

Inicio

    escreval("Informe o lado do paralelepípedo")
    leia(a)
    escreval("Informe o lado do paralelepípedo")
    leia(b)
    escreval("Informe o lado do paralelepípedo")
    leia(c)
    
    soma <- a + b + c
    diagonal <- soma ^ 2 + soma ^ 2
    diagonal_raiz <- Raizq(diagonal)
    
    escreval("A diagonal do paralelepípedo é:", diagonal, "aproximadamente", diagonal_raiz)

Fimalgoritmo
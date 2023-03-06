Algoritmo "ex17"
// Disciplina  : Lógica de Programação
// Exercício   : ex17
// Descrição   : Entrar com um número e apresentar o número, quadrado e a raiz.
// Autor(a)    : Leticia Moura Lopes Soares
// Data atual  : 01/03/2023
Var

    num, quadrado: inteiro
    raiz: real

Inicio

    escreval("Informe um número:")
    leia(num)
    
    quadrado := num * num
    raiz := RaizQ(num)
    
    escreval("Número:", num)
    escreval("Quadrado:", quadrado)
    escreval("Raiz:", raiz)

Fimalgoritmo
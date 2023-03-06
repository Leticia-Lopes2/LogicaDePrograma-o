Algoritmo "ex07"
// Disciplina  : Lógica de Programação
// Exercício   : ex07
// Descrição   : Recebe um número e informa seu sucessor e antecessor.
// Autor(a)    : Leticia Moura Lopes Soares
// Data atual  : 24/02/2023
Var

    num, sucessor, antecessor: inteiro

Inicio

    escreval("Digite um número")
    leia(num)
    sucessor <- num + 1
    antecessor <- num - 1
    escreval("O antecessor de", num, " é", antecessor, " e o sucessor é", sucessor)

Fimalgoritmo
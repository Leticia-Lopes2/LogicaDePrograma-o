Algoritmo "ex37"
// Disciplina  : Lógica de Programação
// Exercício   : ex37
// Descrição   : Calcula e apresenta o valor do volume de uma lata de óleo
// Autor(a)    : Leticia Moura Lopes Soares
// Data atual  : 21/02/2023
Var

    altura, raio, VALOR_PI, volume: real

Inicio

    ESCREVA("Altura é: ")
    LEIA(Altura)
    ESCREVA("Raio é: ")
    LEIA(raio)
    VALOR_PI <- 3,14159
    volume <- VALOR_PI * raio ^ 2 * altura
    ESCREVA("O valor do volume de uma lata é: ", volume)

Fimalgoritmo
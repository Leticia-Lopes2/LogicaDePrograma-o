Algoritmo "ex23"
// Disciplina  : Lógica de Programação
// Exercício   : ex23
// Descrição   : Entrar com o raio e apresentar o perimetro e a area
// Autor(a)    : Leticia Moura Lopes Soares
// Data atual  : 01/03/2023
Var

    raio, area, perimetro: real

Inicio

    escreval("Informe o raio")
    leia(raio)
    
    perimetro := 2 * PI * raio
    area := PI * raio ^ 2
    
    escreval("Perimetro:", perimetro)
    escreval("Area:", area)

Fimalgoritmo
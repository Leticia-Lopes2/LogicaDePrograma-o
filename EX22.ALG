Algoritmo "ex22"
// Disciplina  : Lógica de Programação
// Exercício   : ex22
// Descrição   : Entrar com a base e a altura de um retangulo e retornar
// a area, o perimetro e a diagonal
// Autor(a)    : Leticia Moura Lopes Soares
// Data atual  : 01/03/2023
Var

    altura, base, area, perimetro, diagonal: real

Inicio

    escreval("Informe a base")
    leia(base)
    escreval("Informe a altura")
    leia(altura)

    area := base * altura
    perimetro := (base * 2) + (altura * 2)
    diagonal := raizq(area ^ 2 + base ^ 2)
    
    escreval("Area:", area)
    escreval("Perimetro:", perimetro)
    escreval("Diagonal:", diagonal)

Fimalgoritmo
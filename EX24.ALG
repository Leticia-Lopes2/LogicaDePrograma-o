Algoritmo "ex24"
// Disciplina  : Lógica de Programação
// Exercício   : ex24
// Descrição   : Entrar com o lado de um quadrado e apresentar a area, diagonal e o perímetro
// Autor(a)    : Leticia Moura Lopes Soares
// Data atual  : 05/03/2023
Var

    perimetro, area, diagonal, diagonal_raiz, lado: real

Inicio

    //ENTRADA
    escreval("Informe o lado do quadrado")
    leia(lado)
    //PROCESSO
    area <- lado ^ 2
    diagonal <- lado ^ 2 + lado ^ 2
    diagonal_raiz <- raizq(diagonal)
    perimetro <- lado * 4
    
    //SAÍDA
    escreval("A área do quadrado é:", area)
    escreval("A diagonal do quadrado é:", diagonal," aproximadamente:", diagonal_raiz)
    escreval("O perímetro do quadrado é:", perimetro)

Fimalgoritmo
Algoritmo "ex12"
// Disciplina  : Lógica de Programação
// Exercício   : ex12
// Descrição   : Informar dois números reais e imprimir na tela, antes de
//imprimir, apresentar a palavra "Soma"
// Autor(a)    : Leticia Moura Lopes Soares
// Data atual  : 24/02/2023
Var

    num1, num2, media: real
    media_tex: caractere

Inicio

    escreval("Informe um número")
    leia(num1)
    escreval("Informe outro número")
    leia(num2)
    media <- (num1 + num2) / 2
    media_tex <- "Média:"
    escreval(media_tex, media)
    
Fimalgoritmo
Algoritmo "ex13"
// Disciplina  : Lógica de Programação
// Exercício   : ex13
// Descrição   : Entrar com dois números inteiror e informar: dividendo, divisor, quociente, resto.
// Autor(a)    : Leticia Moura Lopes Soares
// Data atual  : 28/02/2023
Var

    num1, num2, dividendo, divisor, resto: inteiro
    quociente: real

Inicio

    escreval("Informe o primeiro número")
    leia(num1)
    escreval("Informe o segundo número")
    leia(num2)

    dividendo <- num1
    divisor <- num2
    quociente <- (num1 / num2)
    resto <- (num1 % num2)
    escreval("Dividendo:", dividendo , " Divisor:", divisor , " Quociente:", quociente , " Resto:", resto)
    se(resto = 0) entao
    escreval("A divisão é exata")
    senao
    escreval("A divisao não exata")
    fimse

Fimalgoritmo
Algoritmo "ex21"
// Disciplina  : Lógica de Programação
// Exercício   : ex21
// Descrição   :
// Autor(a)    : Leticia Moura Lopes Soares
// Data atual  : 05/03/2023
Var

    nome, prim_letra, ultimo, tres_caract, quarto, menosPrim, ultimos: caractere

Inicio

   //LETICIA MOURA LOPES SOARES
    escreval("Digite seu nome completo")
    leia(nome)
    escreval(nome)
    
    //PRIMEIRO CARACTERE
    prim_letra <- copia (nome,1,1)
    escreval("Primeiro caractere:", prim_letra)
    
    //ULTIMO CARACTERE
    ultimo <- copia(nome, Compr (nome),1)
    escreval("Ultimo caractere:", ultimo)
    
    //DO PRIMEIRO ATÉ O TERCEIRO CARACTERE
    tres_caract <- copia(nome, 1,3)
    escreval("Do primeiro até o terceiro:", tres_caract)
    
    //QUARTO CARACTERE
    quarto <- copia(nome, 4,1)
    escreval("Quarto caractere:", quarto)
    
    //TODOS MENOS O PRIMEIRO
    menosPrim <- copia(nome, 2, 30)
    escreval(" Todos menos o primeiro caractere:", menosPrim)
    
    //OS DOIS ULTIMOS
    ultimos <- copia(nome,25,2)
    escreval("Os dois últimos:", ultimos)

Fimalgoritmo
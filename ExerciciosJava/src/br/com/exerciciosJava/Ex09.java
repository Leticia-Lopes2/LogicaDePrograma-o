package br.com.exerciciosJava;

import java.util.Scanner;

/*Receba dois números inteiros e apresente a soma. Antes de apresentar o resultado, deverá aparecer a mensagem: Soma.*/

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int num1, num2, soma;
		
		System.out.println("Informe um número");
		num1 = read.nextInt();
		
		System.out.println("Informe outro número");
		num2 = read.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("O resultado da soma entre " + num1 + " e " + num2 + " é: " + soma);
		
		read.close();

	}

}

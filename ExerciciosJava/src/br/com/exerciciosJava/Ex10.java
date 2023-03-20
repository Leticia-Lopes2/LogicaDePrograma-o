package br.com.exerciciosJava;

import java.util.Scanner;

/*Receba dois números inteiros e apresente o seu produto.*/

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int num1, num2, produto;
		
		System.out.println("Informe um número");
		num1 = read.nextInt();
		
		System.out.println("Informe outro número");
		num2 = read.nextInt();
		
		produto = num1 * num2;
		
		System.out.println("O produto é " + produto);
		
		read.close();
		
	}

}

package br.com.exerciciosJava;

import java.util.Scanner;

/*Leia e apresente dois números inteiros.*/

public class Ex06 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("Informe um número inteiro");
		num1 = read.nextInt();
		
		System.out.println("Informe outro número inteiro");
		num2 = read.nextInt();
		
		System.out.println("Os números informados foram: " + num1 + " e " + num2);
		
		read.close();	

	}

}

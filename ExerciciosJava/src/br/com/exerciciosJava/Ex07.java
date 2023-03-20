package br.com.exerciciosJava;

import java.util.Scanner;

/*Receba um número inteiro e apresente seu sucessor e seu antecessor.*/

public class Ex07 {
	
	public static void main(String[]args) {
		
	Scanner read = new Scanner(System.in);
	
	int num, antecessor, sucessor;
	
	System.out.println("Informe um número inteiro");
	num = read.nextInt();
	
	antecessor = num - 1;
	sucessor = num + 1;
	
	System.out.println("O sucessor de " + num + " é " + sucessor + " e o antecessor é " + antecessor);
	
	read.close();
	
	}
}

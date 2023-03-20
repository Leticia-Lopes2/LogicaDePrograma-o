package br.com.exerciciosJava;

import java.util.Scanner;

/*Leia um número real e imprimir a terça parte deste número.*/

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double num, tercaParte;
		
		System.out.println("Informe um número real: ");
		num = read.nextDouble();
		
		tercaParte = num / 3;
		
		System.out.println("A terça parte de " + num + " é: " + tercaParte);
		
		read.close();
		

	}

}

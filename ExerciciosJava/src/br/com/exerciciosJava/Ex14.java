package br.com.exerciciosJava;

import java.util.Scanner;

/*Entrar com quatro números e imprimir a média ponderada, sabendo-se que os pesos 
são respectivamente: 1, 2, 3 e 4.*/


public class Ex14 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int num1, num2, num3, num4, p1, p2, p3, p4, medPond;
		
		System.out.println("Informe quatro números");
		
		System.out.println("Informe quatro números");
		num1 = read.nextInt();
		
		System.out.println("Informe quatro números");
		num2 = read.nextInt();
		
		System.out.println("Informe quatro números");
		num3 = read.nextInt();
		
		System.out.println("Informe quatro números");
		num4 = read.nextInt();
		
		p1 = 1;
		p2 = 2;
		p3 = 3;
		p4 = 4;
		
		medPond = (num1 * p1 + num2 * p2 + num3 * p3 + num4 * p4) / 10;
		
		System.out.println("A média ponderada é " + medPond);
		
		read.close();
		
	}

}

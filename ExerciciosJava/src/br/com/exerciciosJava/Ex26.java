package br.com.exerciciosJava;

import java.util.Scanner;

/*)Calcule e apresente a área de um triângulo.*/

public class Ex26 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double area, base, altura;
		
		System.out.println("Informe a base do triângulo ");
		base = read.nextDouble();
		
		System.out.println("Informe a altura do triângulo ");
		altura = read.nextDouble();
		
		area = (base * altura) / 2;
		
		System.out.println("A área do triângulo é: " + area);
		
		read.close();

	}

}

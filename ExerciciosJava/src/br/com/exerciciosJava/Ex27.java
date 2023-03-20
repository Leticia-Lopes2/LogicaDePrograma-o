package br.com.exerciciosJava;

import java.util.Scanner;

/*Calcule e apresente a área de um losango.*/

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double diaMaior, diaMenor, area;
		
		System.out.println("Informe a diagonal Maior");
		diaMaior = read.nextDouble();
		
		System.out.println("Informe a diagonal menor");
		diaMenor = read.nextDouble();
		
		area = diaMaior * diaMenor / 2;
		
		System.out.println("A área doo losango é: " + area + "cm².");

		read.close();
		
	}

}

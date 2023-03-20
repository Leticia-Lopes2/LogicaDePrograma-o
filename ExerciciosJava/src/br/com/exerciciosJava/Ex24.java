package br.com.exerciciosJava;

import java.util.Scanner;

/*Entrar com o lado de um quadrado e apresente:
• Perímetro:
• Área:
• Diagonal:*/

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double lado, perimetro, area, diagonal;
		
		System.out.println("Informe o lado do quadrado");
		lado = read.nextDouble();
		
		perimetro = lado * 4;
		area = Math.pow(lado, 2);
		diagonal = lado * Math.sqrt(2);
		
		
		System.out.printf("Perimetro: %.3f%n ", perimetro);
		System.out.printf("Área: %.3f%n ", area);
		System.out.printf("Diagonal: %.3f%n ", diagonal);
		
		read.close();

	}

}

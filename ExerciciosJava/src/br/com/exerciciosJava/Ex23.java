package br.com.exerciciosJava;

import java.util.Scanner;

/*Entrar com o raio de um círculo e apresente a seguinte saída:
• Perímetro:
• Área:
*/

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double raio, perimetro, area, PI;
		
		System.out.println("Informe o raio ");
		raio = read.nextDouble();
		
		PI = 3.14;
		perimetro = 2 * Math.PI * raio;
		area = PI * Math.pow(raio, 2);
		
		System.out.printf("Perimetro: %.2f%n ", perimetro);
		System.out.printf("Área: %.2f%n ", area);
		
		read.close();
		
	}

}

package br.com.exerciciosJava;

import java.util.Scanner;

/*)Entrar com a base e a altura de um retângulo e apresente a seguinte saída:
• Perímetro:
• Área:
• Diagonal:
*/

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double base, altura, perimetro, area, diagonal;
		
		System.out.println("Informe a base");
		base = read.nextDouble();
		
		System.out.println("Informe a altura");
		altura = read.nextDouble();

		area = base * altura;
		perimetro = (base * 2) + (altura * 2);
		diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Área: " + area);
		System.out.println("Diagonal: ");
		System.out.format("%.3f", diagonal);
		
		read.close();
		
	}

}

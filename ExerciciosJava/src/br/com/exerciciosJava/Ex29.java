package br.com.exerciciosJava;

import java.util.Scanner;

/*)Entrar com as notas de AV1 e AV2 e apresente a média final:
• Truncada:
• Arredondada:*/

public class Ex29 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		double av1, av2, truncada, arredondada;
		
		System.out.println("Digite a nota da AV1: ");
		av1 = read.nextDouble();
		
		System.out.println("Digite a nota da AV2: ");
		av2 = read.nextDouble();
		
		truncada = (int) ((av1 + av2) / 2);
		arredondada = Math.round(((av1 + av2) / 2) * 10.0) / 10.0;
		
		System.out.println("Média truncada: " + truncada);
		
		System.out.println("Média arredondada: " + arredondada);
		
		read.close();

	}

}

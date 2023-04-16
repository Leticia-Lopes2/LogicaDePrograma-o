package br.com.exerciciosJava;

import java.util.Scanner;

/*Leia o peso de uma pessoa, só a parte inteira, calcular e apresentar:
• O peso da pessoa em gramas
• Novo peso, em gramas, se a pessoa engordar 12%
*/

public class Ex47 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int peso, pesoGramas;
		double newPeso;
		
		System.out.println("Informe o seu peso: ");
		peso = read.nextInt();
		
		pesoGramas = peso * 1000;
		newPeso = pesoGramas * 1.12;
		
		System.out.println("O seu peso em gramas é " + pesoGramas);
		System.out.printf("O seu peso em gramas caso engorde 12 porcento é  %.2f%n " , newPeso);
		
		read.close();
	}

}

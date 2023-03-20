package br.com.exerciciosJava;

import java.util.Scanner;

/*Efetuar o cálculo do valor de uma prestação em atraso, utilizando a fórmula:
prestação = valor + (valor * (taxa / 100) * tempo).
*/

public class Ex39 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		double valor, taxa, prest;		
		int tempo;
		
		System.out.println("Informe o valor que está devendo");
		valor = read.nextDouble();
		
		System.out.println("Informe o valor da taxa");
		taxa = read.nextDouble();
		
		System.out.println("Informe o tempo do atraso (dias)");
		tempo = read.nextInt();
		
		prest = valor + (valor * (taxa / 100) * tempo);
		
		System.out.println("O novo valor da prestação é " + prest);
		
		read.close();
				
	}

}

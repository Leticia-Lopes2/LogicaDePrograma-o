package br.com.exerciciosJava;

import java.util.Scanner;

/*Receba o valor de um depósito e o valor da taxa de juros. Calcular e apresentar o valor
do rendimento e o valor total depois do rendimento*/

public class Ex44 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double deposito, taxa, rendimento, valorT;
		
		System.out.println("Informe o valor do deposito: ");
		deposito = read.nextDouble();
		
		System.out.println("Informe o valor da taxa: ");
		taxa = read.nextDouble();
		
		rendimento = deposito * (taxa / 100);
		valorT = deposito + rendimento;
		
		System.out.printf("O valor do rendimento é R$%.2f\\n: " + rendimento);
		System.out.printf("O valor do rendimento é R$%.2f\\n: " + valorT);
		
		read.close();

	}

}

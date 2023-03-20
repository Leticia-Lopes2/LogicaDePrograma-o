package br.com.exerciciosJava;

import java.util.Scanner;

/*Informe o saldo de uma aplicação e apresente o novo saldo, considerando o reajuste 
de 1%*/

public class Ex18 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double saldo, new_saldo, taxa;
		
		System.out.println("Informe o saldo");
		saldo = read.nextDouble();
		
		taxa = saldo * 0.01;
		new_saldo = saldo - taxa;
		
		System.out.println("O novo saldo é " + new_saldo);
		
		read.close();

	}

}

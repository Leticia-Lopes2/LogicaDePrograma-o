package br.com.exerciciosJava;

import java.util.Scanner;

public class Ex54 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double salario, valorFinal, taxa;
		int dia, diasTrab;
		
		System.out.println("Informe a quantidade de dias trabalhados: ");
		diasTrab = read.nextInt();
		
		dia = 20;
		salario = diasTrab * dia;
		taxa = salario * 0.08;
		valorFinal = salario - taxa;
		
		System.out.println("O salario final é: " + valorFinal);
		
		read.close();

	}

}

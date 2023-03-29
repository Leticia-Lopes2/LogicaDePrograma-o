package br.com.exerciciosJava;

import java.util.Scanner;

/*6)Para vários tributos, a base de cálculo é o salário mínimo. Leia o valor do salário mínimo
e o valor do salário de uma pessoa. Calcular e apresentar quantos salários mínimos ela
ganha*/

public class Ex46 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double salMinimo, salario, qtdeSalMin;

		System.out.println("Informe o salario minimo: ");
		salMinimo = read.nextDouble();
		
		System.out.println("Informe o seu salário: ");
		salario = read.nextDouble();
		
		qtdeSalMin = salario / salMinimo;

		System.out.println("A pessoa ganha " + qtdeSalMin + " salários minimos");
		
		read.close();

	}

}

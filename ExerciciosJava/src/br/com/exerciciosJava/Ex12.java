package br.com.exerciciosJava;

import java.util.Scanner;

/*Entrar com dois números reais e imprimir a média aritmética com a mensagem “Média” antes do resultado.*/

public class Ex12 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double n1, n2, result;
		System.out.println("Informe um número real");
		n1 = read.nextDouble();
		
		System.out.println("Informe outro número real");
		n2 = read.nextDouble(); 
		
		result = (n1 + n2) / 2;
		
		System.out.println("A média é " + result);
	
		read.close();
		
	}

}

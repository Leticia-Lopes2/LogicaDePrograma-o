package br.com.exerciciosJava;

import java.util.Scanner;

/*Receba o numerador e o denominador de uma fração e transformá-lo em um número
decimal*/

public class Ex41 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		double numerador, denominador, decimal;
		
		System.out.println("Informe o numerador");
		numerador = read.nextInt();
		
		System.out.println("Informe o numerador");
		denominador = read.nextInt();
		
		decimal = numerador / denominador;
		
		System.out.println("Resultado: " + decimal);
		
		read.close();
		
	}

}

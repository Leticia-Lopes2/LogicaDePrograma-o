package br.com.exerciciosJava;

import java.util.Scanner;

/*Entrar com a razão de uma PG e o valor do 1º termo. Calcular e apresentar o 5º termo
da série.*/

public class Ex33 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double razao, firstTerm, fifthTerm;
		
		System.out.println("Informe a razão da PG: ");
		razao = read.nextDouble();
		
		System.out.println("Infome o primeiro termo da PG");
		firstTerm = read.nextDouble();
		
		fifthTerm = firstTerm * Math.pow(razao, 4);
		
		System.out.println("O quinto termo da PG é: " + fifthTerm);
	 	
		read.close();

	}

}

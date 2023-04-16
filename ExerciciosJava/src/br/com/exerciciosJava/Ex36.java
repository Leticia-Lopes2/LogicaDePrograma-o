package br.com.exerciciosJava;

import java.util.Scanner;

/*Ler uma temperatura em graus centígrados e apresenta-la convertida em graus
Fahrenheit. A fórmula de conversão é: 𝐹 =
9.𝑐+160
5
onde F é a temperatura em Fahrenheit
e C é a temperatura em centígrados.*/

public class Ex36 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double tempF, tempC;
		
		System.out.println("Informe a temperatura em graus");
		tempC = read.nextDouble();
		
		tempF = (9 * tempC + 160) / 5;
		
		System.out.println("A temperatura em Fahrenheit é: " + tempF);
		
		read.close();
		
	}

}

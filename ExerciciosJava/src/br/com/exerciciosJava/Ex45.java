package br.com.exerciciosJava;

import java.util.Scanner;

/*)Receba um número real, calcular e apresentar:
• A parte inteira do número
5
• A parte fracionária do número
• O número arredondado
*/

public class Ex45 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int parteInteira;
		double num, numFracionado, numArredondado;
		
		System.out.println("Informe um número real: ");
		num = read.nextDouble();
		
		parteInteira = (int) num;
		numFracionado = num - parteInteira;
		numArredondado = Math.round(num);
		
		
		System.out.println("O número inteiro: " + parteInteira);
		System.out.println("Número fracionário: " + numFracionado);
		System.out.println("Número arredondado: " + numArredondado);
		
		read.close();

	}

}
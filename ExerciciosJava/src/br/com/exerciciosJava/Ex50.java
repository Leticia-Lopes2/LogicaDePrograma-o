package br.com.exerciciosJava;

import java.util.Scanner;

/*0)Dado um polígono convexo de n lados, podemos calcular o número de diagonais
diferentes (nd) desse polígono pela fórmula: nd = n(n - 3)/2. Leia quantos lados tem
o polígono, calcule e escreva o número de diagonais diferentes (nd) do mesmo.*/

public class Ex50 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int lados, diagonais;
		
		System.out.println("Informe os lados dos polignos");
		lados = read.nextInt();
		
		diagonais = lados * (lados - 3) / 2;
		
		System.out.println("O número de diagonais é: " + diagonais);
		
		read.close();
	}

}

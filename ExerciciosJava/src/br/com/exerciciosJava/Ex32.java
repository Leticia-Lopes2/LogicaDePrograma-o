package br.com.exerciciosJava;

import java.util.Scanner;

/*Entrar com a razão de uma PA e o valor do 1º termo. Calcular e apresentar o 10º termo
da série.
*/

public class Ex32 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double razao, firstTerm, tenthTerm;
		
		System.out.println("Digite a razão da PA: ");
		razao = read.nextDouble();
		
		System.out.println("Digite o primeiro termo: ");
		firstTerm = read.nextDouble();
		
		tenthTerm = firstTerm + 9 * razao;
		
		System.out.println("O decimo termo é: " + tenthTerm);
		
		read.close();

	}

}

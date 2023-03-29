package br.com.exerciciosJava;

import java.util.Scanner;

/*Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% para
o garçom. Leia o valor gasto com despesas realizadas em um restaurante e apresente
o valor total com a gorjeta.
*/

public class Ex42 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double despesas, gorjeta;
		
		System.out.println("Informe o valor gasto com despesas");
		despesas = read.nextDouble();
		
		gorjeta = despesas * 1.1;
		
		System.out.println("O valor total da gorjeta é: " + gorjeta);
		
		 read.close();
	}

}

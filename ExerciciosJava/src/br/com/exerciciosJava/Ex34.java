package br.com.exerciciosJava;

import java.util.Scanner;

/*)Em épocas de pouco dinheiro, os comerciantes estão procurando aumentar suas vendas
oferecendo desconto. Forneça o valor de um produto e apresente o novo valor tendo
em vista que o desconto foi de 9%.*/

public class Ex34 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double produto, desconto, valorFinal;
		
		System.out.println("Informe o valor do produto: ");
		produto = read.nextDouble();
		
		desconto = produto * 9 / 100;
		valorFinal = produto - desconto;
		
		System.out.println("O valor do produto com desconto é: " + valorFinal);
		
		read.close();

	}

}

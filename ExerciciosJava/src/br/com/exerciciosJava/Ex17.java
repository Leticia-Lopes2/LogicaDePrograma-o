package br.com.exerciciosJava;

import java.util.Scanner;

/*)Entrar com um número e apresentar a seguinte saída:
• Número:
• Quadrado:
• Raiz quadrada:
*/

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double num, quadrado; 
		
		System.out.println("Informe um número");
		num = read.nextDouble();
		
		double raizQuadrada = Math.sqrt(num);
		
		quadrado = num * num;
		
		System.out.println("A raiz quadrada do número " + num + " é " + raizQuadrada + " e o quadrado é " + quadrado);

		read.close();
		
	}

}

package br.com.exerciciosJava;

import java.util.Scanner;

/*40)Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma que a
variável A passe a ter o valor da variável B e que a variável B passe a ter o valor da
variável A. Apresentar os valores trocados.
*/

public class Ex40 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int a, b, newA, newB;
		
		System.out.println("Informe um número: ");
		a = read.nextInt();
		
		System.out.println("Informe outro número: ");
		b = read.nextInt();
		
		newA = b;
		newB = a;
		
		System.out.println("A: " + newA);
		System.out.println("B: " + newB);

	}

}

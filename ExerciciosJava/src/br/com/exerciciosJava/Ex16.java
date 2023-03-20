package br.com.exerciciosJava;

import java.util.Scanner;

/*16)Entrar com o número e a base em que se deseja calcular o logarítmo desse número e 
apresenta-lo.
*/

public class Ex16 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double num, base, logaritmo;
		
		System.out.println("Informe o número: ");
		num = read.nextDouble();
		
		System.out.println("Informe a base: ");
		base = read.nextDouble();
		
		logaritmo = Math.log(num) / Math.log(base);
		
		System.out.println("O logaritmo de " + num + " na base " + base + " é: " + logaritmo);
		
		read.close();

	}

}

package br.com.exerciciosJava;

import java.util.Scanner;

/*)Entrar com os lados a, b e c de um paralelepípedo. Calcular e apresentar a diagonal.*/

public class Ex25 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double a, b, c, soma, diagonal, raiz;
		
		System.out.println("Informe o lado a");
		a = read.nextDouble();
		
		System.out.println("Informe o lado b");
		b = read.nextDouble();
		
		System.out.println("Informe o lado c");
		c = read.nextDouble();
		
		soma = a + b + c;
		
		diagonal = Math.pow(soma, 2);
		raiz = Math.sqrt(diagonal);
		
		System.out.println("A diagonal é " + diagonal + " aproximadamente: " + raiz);
		
		read.close();

	}

}

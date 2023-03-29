package br.com.exerciciosJava;

import java.util.Scanner;

/*Entrar com os valores dos catetos de um triângulo retângulo e apresente a hipotenusa.*/

public class Ex31 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double cateto1, cateto2, hipotenusa, raizq, quad1, quad2;
		
		System.out.println("Informe os catetos");
		cateto1 = read.nextDouble();
		
		System.out.println("Informe os catetos");
		cateto2 = read.nextDouble();
		
		quad1 = Math.pow(cateto1, 2);
		quad2 = Math.pow(cateto2, 2);
		raizq = quad1 + quad2;
		hipotenusa = Math.sqrt(raizq);
		
		System.out.println("A hipotenusa é: " + hipotenusa);
		
		read.close();

	}

}

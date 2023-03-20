package br.com.exerciciosJava;
import java.util.Scanner;

/*Leia e apresente um número inteiro*/

public class Ex05 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int numInt;
		
		System.out.println("Informe um número inteiro");
		numInt = read.nextInt();
		
		System.out.println("O número inteiro informado é " + numInt);
		
		read.close();
		
	}

}

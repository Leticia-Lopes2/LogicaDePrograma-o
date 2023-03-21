package br.com.exerciciosJava;

import java.util.Scanner;

/*Leia um número entre 0 e 60 e apresente o seu sucessor, sabendo que o sucessor de
60 é 0. Não pode ser utilizado nenhum comando de seleção e nem de repetição.
*/

public class Ex48 {

	public static void main(String[] args) {
		
		 Scanner read = new Scanner(System.in);
		 
		 int num1, sucessor, antecessor;
		 
		 System.out.println("Informme um número entre 0 e 60");
		 num1 = read.nextInt();
		 
		 sucessor = num1 + 1;
	     antecessor = num1 - 1;
			
	     System.out.println("O antecessor de " + num1 + " é " + antecessor + " e o sucessor é " + sucessor);
	     
	     read.close();

	}

}

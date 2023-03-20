package br.com.exerciciosJava;

import java.util.Scanner;

/*)Entre com nome e idade. Apresente a seguinte saída:
• Nome:
• Idade:*/

public class Ex28 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Informe seu nome: ");
		nome = read.next();
		
		System.out.println("Informe sua idade: ");
		idade = read.nextInt();
		
		System.out.println("Nome: " + nome + " Idade: " + idade);
		
		read.close();
		
	}

}

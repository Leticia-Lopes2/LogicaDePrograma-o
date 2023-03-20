package br.com.exerciciosJava;

import java.util.Scanner;

/* Receba nome, endereço e telefone e apresente-os.*/

public class Ex08 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String nome, endereco, telefone;
		
		System.out.println("Informe seu nome");
		nome = read.next();
		
		System.out.println("Informe seu endereco");
		endereco = read.next();
		
		System.out.println("Informe seu telefone");
		telefone = read.next();
		
		System.out.println("Nome: " + nome + " Endereço: " + endereco + " Telefone: " + telefone);

		read.close();
		
	}

}

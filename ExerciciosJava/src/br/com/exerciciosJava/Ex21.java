package br.com.exerciciosJava;

import java.util.Scanner;

/*1)Entrar com um nome e apresente:
• Todo nome://
• Primeiro caractere://
• Último caractere://
• Do primeiro até o terceiro:
• Quarto caractere:
• Todos menos o primeiro:
• Os dois últimos:
*/

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String fullName, first, last, firstTree, fo, menosFirst, twoLast; 
		
		System.out.println("Informe seu nome completo: ");
		fullName = read.nextLine();
		
		first = fullName.substring(0, 1);
		last = fullName.substring(fullName.length() - 1);
		firstTree = fullName.substring(0, 3);
		fo = fullName.substring(3,4);
		menosFirst = fullName.substring(1);
        twoLast = fullName.substring(fullName.length() - 2);
		
		System.out.println("Nome completo: " +  fullName);
		
		System.out.println("Primeiro caractere: " + first);
		
		System.out.println("Último caractere: " + last);
	
		System.out.println("Três caractere: " + firstTree);

		System.out.println("Quarto caractere: " + fo);

		System.out.println("Menos o primeiro: " + menosFirst);
		
		System.out.println("Dois últimos: " + twoLast);
		
	 	read.close();
		
	}

}

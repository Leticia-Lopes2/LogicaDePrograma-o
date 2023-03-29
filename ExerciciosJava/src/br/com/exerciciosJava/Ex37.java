package br.com.exerciciosJava;

import java.util.Scanner;

/*Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
𝑣𝑜𝑙𝑢𝑚𝑒 = 3.14159 ∗ 𝑅
2
∗ 𝑎𝑙𝑡𝑢𝑟𝑎.*/

public class Ex37 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double volume, altura, raio;
		
		System.out.println("Informe o raio: ");
		raio = read.nextDouble();
		
		System.out.println("Informe a altura: ");
		altura = read.nextDouble();
		
		volume = Math.PI * Math.pow(raio, 2) * altura;
		
		System.out.println("O volume da lata de oleo é: " + volume);
		
		read.close();
		

	}

}

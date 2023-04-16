package br.com.exerciciosJava;

import java.util.Scanner;

/*)Uma pessoa resolveu fazer uma aplicação em uma poupança programada. Para calcular
seu rendimento, ela deverá fornecer o valor constante da aplicação mensal, a taxa e o
número de meses. Sabendo-se que a fórmula usada para este cálculo é:
𝑣𝑎𝑙𝑜𝑟 𝑎𝑐𝑢𝑚𝑢𝑙𝑎𝑑𝑜 = 𝑃 ∗
(1 + 𝑖)
𝑛 − 1
𝑖
𝑖 = 𝑡𝑎𝑥𝑎
𝑃 = 𝑎𝑝𝑙𝑖𝑐𝑎çã𝑜 𝑚𝑒𝑛𝑠𝑎𝑙
𝑛 = 𝑛ú𝑚𝑒𝑟𝑜𝑠 𝑑𝑒 𝑚𝑒𝑠𝑒�*/

public class Ex51 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numMeses;
		double taxa, apMensal, rend;
		
		System.out.println("Informe o valor da aplicação mensal: ");
		apMensal = read.nextDouble();
		
		System.out.println("Informe o valor da taxa: ");
		taxa = read.nextDouble();
		
		System.out.println("Informe o número de meses: ");
		numMeses = read.nextInt();
		
		rend = apMensal * ( (Math.pow( (1 + taxa / 100), numMeses) - 1) / (taxa / 100) );
		
		System.out.println("O seu rendimento é: " + rend);
		
		read.close();
		
	}

}

package br.com.exerciciosJava;

import java.util.Scanner;

/*Efetue o cálculo do salário líquido de um professor. Os dados fornecidos serão: valor
da hora aula, número de aulas dadas no mês e percentual de desconto do INSS.*/

public class Ex35 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double aulaMes, salario, newSalario, aulaHora, desconto;
		
		System.out.println("Informe o valor da hora de aula: ");
		aulaHora = read.nextDouble();
		
		System.out.println("Informe a quantidade de aulas dadas no mês: ");
		aulaMes = read.nextDouble();
		
		System.out.println("Informe o percentual de desconto do INSS: ");
		desconto = read.nextDouble();
		
		salario = aulaHora * aulaMes;
		newSalario = salario - (salario * desconto / 100);
		
		System.out.println("O valor liquido do salário de um professor é: " + newSalario);
		
		read.close();

	}

}

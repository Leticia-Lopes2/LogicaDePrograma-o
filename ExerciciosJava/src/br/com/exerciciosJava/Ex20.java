package br.com.exerciciosJava;

import java.util.Scanner;

/*Antes de o racionamento de energia ser decretado, quase ninguém falava em
quilowatts; mas, agora, todos incorporaram essa palavra em seu vocabulário.
Sabendo-se que 100 quilowatts de energia custa um sétimo do salário mínimo, efetue
o recebimento do valor do salário mínimo e a quantidade de quilowatts gasto por uma
residência e calcule. Apresente:
• O valor em reais de cada quilowatt.
• O valor em reais a ser pago.
• O novo valor a ser pago por essa residência com um desconto de 10%*/

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double salario, quilowatts, valorQuilowatt, valorTotal, valorNew;
		
		System.out.println("Informe o salario:");
		salario = read.nextDouble();
		
		System.out.println("Informe a quantidade de gasto com quilowatts:");
		quilowatts = read.nextDouble();
		
		valorQuilowatt = salario / 700; // 1/7 do salario
		valorTotal = valorQuilowatt * quilowatts;
		valorNew = valorTotal * 0.9; //Desconto de 10%
		
		System.out.printf("O valor em reais de cada quilowatts é: %.2f\n", valorQuilowatt);
		System.out.printf("O valor em reais a ser pago é: %.2f\n", valorTotal);
		System.out.printf("O novo valor a ser pago com o desconto de 10% é: %.2f\n", valorNew);
		
		read.close();
		
	}

}

package br.com.exerciciosJava;

import java.util.Scanner;

/*Entrar com dois números inteiros e imprimir a seguinte saída:
• Dividendo:
• Divisor:
• Quociente:
• Resto:
*/

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int num1, num2, dividendo, divisor, quociente, resto;
		
		System.out.println("Informe um número");
		num1 = read.nextInt();
		
		System.out.println("Informe outro número");
		num2 = read.nextInt();
		
		dividendo = num1;
		divisor = num2;
		quociente = (num1 / num2);
		resto = (num1 % num2);
		
		System.out.println("Dividendo: " + dividendo);
		System.out.println("Divisor: " + divisor);
		System.out.println("Quociente: " + quociente);
		System.out.println("Resto: " + resto);

		read.close();
		
	}

}

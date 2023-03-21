package br.com.exerciciosJava;

import java.util.Scanner;

/*Ler dois números reais e imprimir o quadrado da diferença do primeiro valor pelo
segundo e a diferença dos quadrados.
*/

public class Ex49 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double num1, num2, quadradoDif, difQuadrado, diferenca, quadradoNum1, quadradoNum2;
		
		System.out.println("Informe o primeiro número");
		num1 = read.nextDouble();
		
		System.out.println("Informe o primeiro número");
		num2 = read.nextDouble();
		
		diferenca = num1 - num2;
		quadradoDif = Math.pow( diferenca, 2);
		
		quadradoNum1 = Math.pow(num1, 2);
		quadradoNum2 = Math.pow(num2, 2);
		
		difQuadrado = quadradoNum1 - quadradoNum2;
		
		System.out.println("O quadrado da diferença entre o primeiro e o segundo número é: " + quadradoDif);
		System.out.println("A diferença dos quadrados entre o primeiro e o segundo número é: " + difQuadrado);
	    
	     read.close();
		
	}

}

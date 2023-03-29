package br.com.exerciciosJava;

import java.util.Scanner;

/*)Entrar com valores para xnum1, xnum2, e xnum3 e apresentar o valor de x, sabendose que:
𝑋 = 𝑥𝑛𝑢𝑚1 + 𝑥𝑛𝑢𝑚2 / 𝑥𝑛𝑢𝑚3 +𝑥𝑛𝑢𝑚1 + 2(𝑥𝑛𝑢𝑚1 − 𝑥𝑛𝑢𝑚2)+𝑙𝑜𝑔2 64
*/

public class Ex30 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double xnum1, xnum2, xnum3, x;
		
		System.out.println("Informe o primeiro número");
		xnum1 = read.nextDouble();
				
		System.out.println("Informe o segundo número");
		xnum2 = read.nextDouble();
		
		System.out.println("Informe o terceiro número");
		xnum3 = read.nextDouble();
		
		x = xnum1 + (xnum2 / (xnum3 + xnum1) + 2 * (xnum1 - xnum2) + (Math.log(64) / Math.log(2) ) );
		
		System.out.printf("O valor de x é: %.2f " , x);
		
		read.close();
	}

}

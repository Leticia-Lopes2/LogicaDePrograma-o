package br.com.exerciciosJava;

import java.util.Scanner;

/*Entrar com um número no formato CDU e apresentar invertido: UDC. (Exemplo: 123, 
sairá 321). O número deverá ser armazenado em outra variável antes de ser 
apresentado.
*/

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		double  unidade, centena, dezena, udc;
		int cdu;
		
		System.out.println("Digite um número no formato CDU: ");
		cdu = read.nextInt();
		
		unidade = cdu % 10;
		centena = (cdu / 10) % 10;
		dezena = (cdu / 100) % 10;
		
		udc = unidade * 100 + dezena * 10 + centena;
		
		System.out.println("O número invertido é: " + udc);
		
		read.close();

	}

}

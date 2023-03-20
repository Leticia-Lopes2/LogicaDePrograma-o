package br.com.exerciciosJava;

import java.util.Scanner;

/*Entrar com um ângulo em graus e apresentar: seno, co-seno, tangente, secante, cosecante e co-tangente deste ângulo.*/


public class Ex15 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		double anguloGraus, anguloRadianos, seno, coseno, tang, secante, cossecante, cotangente;
		
		System.out.println("Digite o ângulo em graus: ");
		anguloGraus = read.nextDouble(); 
		
		anguloRadianos = Math.toRadians(anguloGraus);
		 
		seno = Math.sin(anguloRadianos);
		coseno = Math.cos(anguloRadianos);
		tang = Math.tan(anguloRadianos);
		secante = 1 / coseno;
		cossecante = 1 / seno;
		cotangente = 1 / tang;
	
		System.out.printf("Seno: %.3f%n" , seno);
		System.out.printf("Cosseno: %.3f%n" , coseno);
		System.out.printf("Tangente: %.3f%n" , tang);
		System.out.printf("Secante: %.3f%n" , secante);
		System.out.printf("Cossecante: %.3f%n" , cossecante);
		System.out.printf("Cotangente: %.3f%n" , cotangente);
		
		read.close();
	}

}

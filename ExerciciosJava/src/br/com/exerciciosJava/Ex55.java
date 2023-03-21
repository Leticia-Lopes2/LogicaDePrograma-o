package br.com.exerciciosJava;

import java.util.Scanner;

public class Ex55 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		double altura, raio, qtde_total, area_lateral, comp, area_base, area_cilindro, qtde_latas;
		
		System.out.println("Informe o raio: ");
		raio = read.nextDouble();
		
		System.out.println("Informe a altura: ");
		altura = read.nextDouble();
		
		System.out.println("Informe o comprimento: ");
		comp = read.nextDouble();
		
		area_lateral = altura * comp; 
		
		System.out.println("A área lateral é:  " + area_lateral);
		
		area_base = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área da base é" + area_base); 
		
		area_cilindro = area_base + area_lateral;
		
		System.out.println("A área do cilindro é " + area_cilindro); 
		
		qtde_total = area_cilindro / 3;
		
		System.out.println("A área do cilindro é " + area_cilindro);
		
		System.out.println("A quantidade total de litros é " + qtde_total); 
		
		qtde_latas = qtde_total * 50;
		
		System.out.println("A quantidade total de latas é " + qtde_latas); 
					
		read.close();

	}

}

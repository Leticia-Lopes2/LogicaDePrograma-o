package br.com.exerciciosJava;

import java.util.Scanner;

/*Receba um valor de hora e informe quantos minutos se passaram desde o início do dia*/

public class Ex43 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double hora, minutos;
		
		System.out.println("Informe a quantidade de horas desde o inicio no dia: ");
		hora = read.nextDouble();
		
		minutos = hora * 60;
		
		System.out.println("Se passaram " + minutos + " minutos" + " de " + hora + " hora");
		
		read.close();

	}

}

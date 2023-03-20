package br.com.exerciciosJava;

import java.util.Scanner;

/*)Efetuar o cálculo da quantidade de litros de combustível gastos em uma viagem,
sabendo=se que o carro faz 12 km com um litro. Deverão ser fornecidos o tempo gasto
na viagem e a velocidade média.
Utilizar as seguinte fórmulas:

distancia = tempo x velocidade
litros usados = distancia / 12
*/

public class Ex38 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double velocMedia, tempoGasto, distPecorrido, qtdeLitros;
		
		System.out.println("Informe o tempo gasto na viagem");
		tempoGasto = read.nextDouble();
		
		System.out.println("Informe a velocidade média");
		velocMedia = read.nextDouble();
		
		distPecorrido = tempoGasto * velocMedia;
		qtdeLitros = distPecorrido / 12;
		
		System.out.printf("Distancia pecorrida %.3f%n ", distPecorrido);
		System.out.printf("Quantidades de litros %.3f%n ", qtdeLitros);
		
		read.close();

	}

}

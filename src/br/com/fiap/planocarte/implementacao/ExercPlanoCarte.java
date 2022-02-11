package br.com.fiap.planocarte.implementacao;

import java.util.Scanner;

public class ExercPlanoCarte {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x;
		double y;
		
		System.out.println("Determine os valores das coordenadas X e Y: ");
		System.out.println(" 2   |   1 ");
		System.out.println(" ----| ---- ");
		System.out.println(" 3   |   4  ");
		System.out.println();

		System.out.println("Valor de X: ");
		x = sc.nextDouble();
		System.out.println("Valor de Y: ");
		y = sc.nextDouble();
		 
		 if ((x == 0) & (y == 0)) {
				System.out.println("Resultado: Origem");
			}
			else if (y == 0) {
				System.out.println("Resultado: Eixo X");
			}
			else if (x == 0) {
				System.out.println("Resultado: Eixo Y");
			}
			else if ((x > 0) & (y > 0)) {
				System.out.println("Resultado: Q1");
			}
			else if ((x < 0) & (y > 0)) {
				System.out.println("Resultado: Q2");
			}
			else if ((x < 0) & (y < 0)) {
				System.out.println("Resultado: Q3");
			}
			else if ((x > 0) & (y < 0)) {
				System.out.println("Resultado: Q4");
			}
	}
}


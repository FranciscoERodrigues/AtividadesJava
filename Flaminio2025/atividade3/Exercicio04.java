package atividade3;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Calculo da Area do triangulo");
		System.out.println("Digite o valor da base do triangulo :");
		float base = sc.nextFloat();
		System.out.println("Digite o valor da altura do triangulo :");
		float altura = sc.nextFloat();
		float area = base*altura/2;
		System.out.println(" O valor da área do triangulo é :  " + area + " cm²");
		sc.close();
	}

}
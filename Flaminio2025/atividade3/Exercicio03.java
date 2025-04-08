package atividade3;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Calculo da Area do Retângulo");
		System.out.println("Digite o valor da base do retângulo :");
		float base = sc.nextFloat();
		System.out.println("Digite o valor da altura do retângulo :");
		float altura = sc.nextFloat();
		float area = base* altura;
		System.out.println(" O valor da área do retângulo é :  " + area + " cm²");
		sc.close();
	}

}
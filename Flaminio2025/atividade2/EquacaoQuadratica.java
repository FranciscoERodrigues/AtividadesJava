package atividade2;

import java.util.Scanner;


public class EquacaoQuadratica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A da equação quadratica:");
		float numero01 = sc.nextFloat();
		System.out.println("Digite o valor de B da equação quadratica:");
		double numero02 = sc.nextDouble();
		System.out.println("Digite o valor de C da equação quadratica:");
		float numero03 = sc.nextFloat();
		
		double delta = Math.pow(numero02,2.0)-4*numero01*numero03;
		System.out.println(delta);
		sc.close();
		if (delta>0){
			System.out.println("Possui duas raizes");
		}else if (delta == 0) {
		System.out.println("Possui uma raizes");
	}else {
		System.out.println("Não Possui raizes");
	}
		
	}
	
	
}

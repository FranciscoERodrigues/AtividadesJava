package atividade3;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculo dos dias vividos");
		System.out.println("Digite a sua idade expressa em anos:");
		int ano = sc.nextInt();
		System.out.println("Digite a quantidade de meses que passou do seu aniversario:");
		int mes = sc.nextInt();
		System.out.println("Digite a quantidade de dias que passou do seu mesversario:");
		int dia = sc.nextInt();
	
		
		int diasVividos = ano*365 + mes*30 +dia;
		
		System.out.printf("A quantidade de dias vividos é: " + diasVividos + " dias");
		
		sc.close();
		
	}
	

}

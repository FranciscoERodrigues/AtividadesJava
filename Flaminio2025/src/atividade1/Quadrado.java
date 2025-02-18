package atividade1;

import java.util.Scanner;

public class Quadrado {
	public static void main (String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o valor que deseja saber o quadrado:");
		int numero = sc.nextInt();
		int resultado = numero*numero;
		System.out.println(" O valor do quadrado do numero digita do é: " + resultado);
		sc.close();
};
}
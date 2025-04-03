package atividade4;

import java.util.Scanner;

public class SinaldeNumero04 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double valor = sc.nextDouble();
		
		if(valor > 0 ) {
			
			 System.out.println("O numero é positivo !!");
		} else if (valor < 0) {
			
			 System.out.println("O numero é negativo !!");
		}else {
			
			System.out.println("O numero é zero !!");
		}
		
sc.close();
		
	}
}

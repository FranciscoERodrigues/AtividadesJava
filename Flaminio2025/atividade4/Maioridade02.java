package atividade4;

import java.util.Scanner;

public class Maioridade02 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int Maioridade = sc.nextInt();
	
		if (Maioridade > 17) {
			
			System.out.println( " Voce é maior de idade.");
		}else {
			System.out.println(" Voce é menor de idade");
		}
		
		sc.close();
		
	}
	

}

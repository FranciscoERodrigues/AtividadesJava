package exemplos;

import java.util.Scanner;

public class ExemploIf01 {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite um numero:");
			int numero = sc.nextInt();
			
			if(numero<10) {
				
				System.out.println("É menor que 10");
			}
				sc.close();
		}
	
	}

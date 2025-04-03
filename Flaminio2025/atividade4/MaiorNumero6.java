package atividade4;

import java.util.Scanner;

public class MaiorNumero6 {

	public static void main(String[] args) {
		
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println(" Digite um valor: ");
			int numero01 = sc.nextInt();
			System.out.println(" Digite um valor: ");
			int numero02 = sc.nextInt();
			System.out.println(" Digite um valor: ");
			int numero03 = sc.nextInt();
			
			int maior;
			
			 if(numero01 >= numero02 && numero01 >= numero03) {
				 maior = numero01;
			 }else if (numero02 >= numero01 && numero02 >= numero03) {
				 maior = numero02;
			 }else {
				 maior = numero03;
			 }
			

		 System.out.println("O maior numero é:" + maior);

			sc.close();
		}

	}


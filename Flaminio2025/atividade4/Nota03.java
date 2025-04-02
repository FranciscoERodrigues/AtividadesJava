package atividade4;

import java.util.Scanner;

public class Nota03 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua nota:");
		int Nota = sc.nextInt();
		
		if (Nota >= 60) {
			
			System.out.println( " Parabens, você passou de serie !!");
		}else {
			System.out.println(" infelizmente voce reprovou !!");
		}
		
		sc.close();
		
	}
	

	}


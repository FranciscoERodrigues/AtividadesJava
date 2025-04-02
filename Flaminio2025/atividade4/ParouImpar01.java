package atividade4;

import java.util.Scanner;

public class ParouImpar01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int ParouImpar = sc.nextInt();
		
		if (ParouImpar % 2 == 0) {
			
			System.out.println( " O numero " + ParouImpar + " é par");
		}else {
			System.out.println(" O numero " + ParouImpar + " é Impar ");
		}
		
		sc.close();
		
	}

}

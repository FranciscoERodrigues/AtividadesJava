package exemplos;

import java.util.Scanner;

public class ExemplosSwitchCase {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecione uma opção:");
		System.out.println("1 - Administração ");
		System.out.println("2 - Educação Fisica ");
		System.out.println("3 - Enfermagem ");
		System.out.println("4 - Sair ");
		
		int opcao = sc.nextInt();
		
		switch(opcao) {
		
		case 1: 
			System.out.println("Parabéns - Você escolheu curso de Administração");
			break;
		case 2: 
			System.out.println("Parabéns - Você escolheu curso de Educação Fisica");
			break;
		case 3: 
			System.out.println("Parabéns - Você escolheu curso de Enfermagem");
			break;
		case 4: 
			System.out.println("Você escolheu a opção de Sair");
			break;
			default:
			System.out.println("Escolha invalida");
			break;
			
		}
		sc.close();
	}

}

package exerciciosSwitchCase;

import java.util.Scanner;

//1) Verificação de Dia da Semana:
//
//Escreva um programa que solicite ao usuário um número de 1 a 7 e exiba o dia da semana correspondente (1 para Domingo, 2 para Segunda, etc.).

public class DiadaSemana {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8 - sair ");

		int diadaSemana = sc.nextInt();
		
		switch (diadaSemana) {
		case 1: {
			System.out.println("1. Domingo ");
			break;
		}
		
		case 2: {
			System.out.println("2.  Segunda - Feira ");
			break;
		}
		case 3: {
			System.out.println("3. terça - Feira ");
			break;
		}
		
		case 4: {
			System.out.println("4. quarta - Feira ");
			break;
		}
		
		case 5: {
			System.out.println("5. quinta - Feira ");
			break;
		}
		
		case 6: {
			System.out.println("6. sexta - Feira ");
			break;
		}
		
		case 7: {
			System.out.println("7. Sabado ");
			break;
		}
		
		case 8: {
			System.out.println("Saida Solicitada ");
			break;
		}
		
		
		default:
			
			System.out.println("Escolha invalida");
			break;
			
		}
		
		sc.close();
	}

}

package exerciciosSwitchCase;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class EstacaodoAno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 4 para estação do ano");
		System.out.println("1 - Verão");
		System.out.println("2 - Primavera");
		System.out.println("3 - Outono ");
		System.out.println("4 - Inverno ");
		System.out.println("Selecione uma opção valida ");
		
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1: {
			System.out.println("A estação do ano selecionada é Verão");
			break;
		}
		case 2: {
			System.out.println("A estação do ano selecionada é Primavera");
			break;
		}
		
		case 3: {
			
			System.out.println("A estação do ano selecionada é Outono");
			break;
		}
		case 4: {
			System.out.println("A estação do ano selecionada é Inverno");
			break;
		}
		
		
		default:
			System.out.println("Não existe estação do ano correspondente ");
			break;
		}
		
	}
	
}

package exemplos;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a sua idade:");
		int idade = sc.nextInt();

		if (idade < 16) {
			System.out.println("Não pode votar !!");
		}
		if (idade < 18) {
			System.out.println("Pode votar, porem não é obrigatorio");

		} else {
			System.out.println("Pode Votar  !!");

		}

		sc.close();
	}

}

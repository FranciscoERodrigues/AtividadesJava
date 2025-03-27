package exemplos;

import java.util.Scanner;

public class DadosJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int itens = 50;
		float custoPorItens = 9.99f;
		float total = itens * custoPorItens;
		char Moeda = '$';

		System.out.println("Número de itens:" + itens);
		System.out.println("Custo por item: " + custoPorItens + Moeda);
		System.out.println("Total  = " + total + Moeda);

		sc.close();
	}

}

package atividade11;

//8) Imprima os quadrados dos números de 1 a 20.

public class Exercicio08 {

	public static void main(String[] args) {
		
		for (int numero = 1; numero < 21; numero++) {
			
			int quadrado = numero * numero;
			
			System.out.println(numero + "²=" + quadrado);
		}
		

	}

}

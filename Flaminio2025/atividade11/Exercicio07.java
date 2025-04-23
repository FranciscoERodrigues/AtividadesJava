package atividade11;

//7) Conte e imprima quantos números divisíveis por 3 existem entre 1 e 50.

public class Exercicio07 {

	public static void main(String[] args) {
		
		int contador = 0;
		
		for (int i = 1; i < 51; i++) {
			
			if(i%3==0) {
				
				contador++; 
				
			}
		}
		System.out.println("A quantidade de numeros que são divisiveis por 3 é:" + contador);		
	}
}

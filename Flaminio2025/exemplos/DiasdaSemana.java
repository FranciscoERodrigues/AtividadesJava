package exemplos;

import java.util.Scanner;

public class DiasdaSemana {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero correspondente ao dias da semana:");
		int diadaSemana = sc.nextInt();
		
		if(diadaSemana == 1){
		System.out.println("Domingo");
		}
		else if(diadaSemana == 2) {
		System.out.println("Segunda");
		}else if(diadaSemana == 3) {
		System.out.println("Terça");
		}else if(diadaSemana == 4) {
		System.out.println("Quarta");
		}else if(diadaSemana == 5) {
		System.out.println("Quinta");
		}else if(diadaSemana == 6) {
		System.out.println("Sexta");
		}else if(diadaSemana == 7) {
		System.out.println("Sabado");
		}else{
			System.out.println("ERRO !!!");
		}
		sc.close();
		}
	}



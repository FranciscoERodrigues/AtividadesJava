package atividade6;

import java.util.Scanner;

public class MesEstacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 12 do mês, e verifique a estação do ano correspondente:");
		int mes = sc.nextInt();
		int estacao;

		   if(mes == 12 || mes == 1 || mes == 2) {
	            estacao = 1; 
	        } else if(mes == 3 || mes == 4 || mes == 5) {
	            estacao = 2; 
	        } else if(mes == 6 || mes == 7 || mes == 8) {
	            estacao = 3; 
	        } else if(mes == 9 || mes == 10 || mes == 11) {
	            estacao = 4; 
	        } else {
	            estacao = 0; 
	        }
		 switch (estacao) {
         case 1:
             System.out.println("Esse mês corresponde a estação verão!");
             break;
         case 2:
             System.out.println("Esse mês corresponde a estação Outono!");
             break;
         case 3:
             System.out.println("Esse mês corresponde a estação Inverno!");
             break;
         case 4:
             System.out.println("Esse mês corresponde a estação Primavera!");
             break;
         default:
             System.out.println("Erro.");
             break;
		
	}
		  sc.close();

}
	
}

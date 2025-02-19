package atividade1;
import java.util.Scanner;

public class Retangulo {
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite a largura : ");
		float valor01 = sc.nextFloat();
		System.out.println("Digite a altura : ");
		float valor02 = sc.nextFloat();

		float resultado = valor01*valor02;
		System.out.printf("A area desse retangulo: %.2f",resultado);
		sc.close();
	}
}
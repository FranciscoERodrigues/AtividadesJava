package atividade1;
import java.util.Scanner;
public class Divisão {
public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		float numero1=sc.nextFloat();
		System.out.println("Digite o segundo valor:");
		float numero2=sc.nextFloat();
		float resultado = numero1/numero2;
		System.out.printf("O valor da divisão é: %.2f",resultado);
		sc.close();
}

}
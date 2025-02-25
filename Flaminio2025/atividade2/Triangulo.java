package atividade2;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Informe a base do triangulo :");
		double base = sc.nextDouble();
		System.out.println("Informe altura do triangulo :");
		double altura =sc.nextDouble();
		
		double area = (base*altura)/2; 
		System.out.println("A area do triangulo é:" + area);
		sc.close();
	}

}

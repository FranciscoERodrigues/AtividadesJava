package exemplos;

import java.util.Scanner;

public class ExemploJavaMath {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digite um valor: ");
		int numero01 = sc.nextInt();
		System.out.println(" Digite um valor: ");
		int numero02 = sc.nextInt();
		
		
//		O método pode ser usado para encontrar o maior valor de x e y :Math.max(x,y)
		System.out.println("O maior valor digitado pelo cliente é " + Math.max(numero01, numero02));
//		O método pode ser usado para encontrar o menor valor de x e y :Math.min(x,y)		
		System.out.println("O menor valor digitado pelo cliente é " + Math.min(numero01, numero02));
		
		

		sc.close();
	}

}

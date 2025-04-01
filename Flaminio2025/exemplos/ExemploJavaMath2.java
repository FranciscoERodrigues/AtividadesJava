package exemplos;

import java.util.Scanner;

public class ExemploJavaMath2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digite um valor: ");
		int numero01 = sc.nextInt();
			
//		O método retorna a raiz quadrada de x :Math.sqrt(x)
		
		System.out.println("O valor da raiz quadradra é  " + Math.sqrt(numero01));
				
		sc.close();
	}

}

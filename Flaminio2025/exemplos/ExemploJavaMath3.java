package exemplos;

import java.util.Scanner;

public class ExemploJavaMath3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digite um valor: ");
		float numero01 = sc.nextInt();
			
//		O método retorna o valor absoluto (positivo) de x :Math.abs(x)
		
		System.out.println("O valor positivo do numero digitado é " + Math.abs(numero01));
				
		sc.close();
	}

}

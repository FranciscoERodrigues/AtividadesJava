package exemplos;

import java.util.Scanner;

public class ExemploJavaMathRandom4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Digite um valor: ");
		float numero01 = sc.nextFloat();
			
//		Math.random()retorna um número aleatório entre 0,0 (inclusivo) e 1,0 (exclusivo):
		
		System.out.println("O valor aleatorio do numero digitado é : " + Math.random());
				
		sc.close();
	}

}

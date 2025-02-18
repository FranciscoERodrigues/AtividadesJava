package atividade1;
import java.util.Scanner;

		public class Media {
		public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);

	System.out.println("Digite o primeiro valor:");
	float numero1=sc.nextFloat();
	System.out.println("Digite o segundo valor:");
	float numero2=sc.nextFloat();
	System.out.println("Digite o terceiro valor:");
	float numero3=sc.nextFloat();
	
////    float somatoria = nota01+nota02+nota03;
////    float media = somatoria/3;
//		outra maneira de executar.
	
	float somatoria =(int) ((numero1+numero2+numero3)/3);
	System.out.println("A media dos tres valores é :" + somatoria);
	sc.close();
	
	
}
		}

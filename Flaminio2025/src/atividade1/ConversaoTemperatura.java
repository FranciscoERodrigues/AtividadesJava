package atividade1;
import java.util.Scanner;

public class ConversaoTemperatura {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura que deseja converter:");
		
		float temperaturaCelsius = sc.nextFloat();
		float temperaturaFahrenheit= (temperaturaCelsius*9/5)+32;
		System.out.println("A temperatura em graus Fahrenheit convertida é:" + temperaturaFahrenheit);
		sc.close();
		
	}

}

package exemplos;

import java.util.Scanner;

public class ExercicioCronometroFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			for(int Horas = 0; Horas<24; Horas++) {
				for (int Minutos = 0; Minutos<60; Minutos++) {
					for ( int Segundos =0; Segundos <60; Segundos ++) {
						
						System.out.println(Horas + ":" + Minutos+ ":" + Segundos);
					}
					
				}
				
			}

	}

}

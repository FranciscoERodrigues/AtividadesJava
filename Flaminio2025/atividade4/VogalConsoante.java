package atividade4;

import java.util.Scanner;

public class VogalConsoante {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Digite uma letra:");
	        String entrada = sc.next();

	    
	        if (entrada.length() == 1) {
	            char letra = entrada.charAt(0);

	            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
	                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {

	                System.out.println("Essa letra " + letra + " é uma vogal");

	            } else {
	                System.out.println("Essa letra " + letra + " é uma consoante");
	            }

	        } else {
	            System.out.println("Entrada inválida! Digite apenas uma letra.");
	        }

	        
	        sc.close();
	    }
	}

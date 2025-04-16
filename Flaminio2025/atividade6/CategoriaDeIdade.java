package atividade6;

import java.util.Scanner;

public class CategoriaDeIdade {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();
        int categoria;

        if (idade >= 0 && idade <= 12) {
            categoria = 1; 
        } else if (idade >= 13 && idade <= 17) {
            categoria = 2; 
        } else if (idade >= 18 && idade <= 59) {
            categoria = 3;
        } else if (idade >= 60) {
            categoria = 4; 
        } else {
            categoria = 0;
        }

        switch (categoria) {
            case 1:
                System.out.println("Você é considerado uma CRIANÇA!");
                break;
            case 2:
                System.out.println("Você é considerado um ADOLESCENTE!");
                break;
            case 3:
                System.out.println("Você é considerado um ADULTO!");
                break;
            case 4:
                System.out.println("Você é considerado um IDOSO!");
                break;
            default:
                System.out.println("Idade inválida.");
                break;
        }

        sc.close();
    }
}
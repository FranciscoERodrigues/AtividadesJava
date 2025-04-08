package atividade3;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        float lado = sc.nextFloat();

        float area = (float) Math.pow(lado,2);

        System.out.println("A área do quadrado é: "+ area);
        
        sc.close();
    }
}

package atividade6;

import java.util.Scanner;

public class TipoDeTriangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento do primeiro lado: ");
        double lado1 = sc.nextDouble();

        System.out.print("Digite o comprimento do segundo lado: ");
        double lado2 = sc.nextDouble();

        System.out.print("Digite o comprimento do terceiro lado: ");
        double lado3 = sc.nextDouble();

        
        String tipoTriangulo = "";

        if (lado1 == lado2 && lado2 == lado3) {
            tipoTriangulo = "Equilátero"; 
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            tipoTriangulo = "Isósceles"; 
        } else {
            tipoTriangulo = "Escaleno"; 
        }

        switch (tipoTriangulo) {
            case "Equilátero":
                System.out.println("O triângulo é Equilátero.");
                break;
            case "Isósceles":
                System.out.println("O triângulo é Isósceles.");
                break;
            case "Escaleno":
                System.out.println("O triângulo é Escaleno.");
                break;
            default:
                System.out.println("Entrada inválida.");
                break;
        }

        sc.close();
    }
}
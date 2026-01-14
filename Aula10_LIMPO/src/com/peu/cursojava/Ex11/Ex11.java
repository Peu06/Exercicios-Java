package com.peu.cursojava.Ex11;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scan.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scan.nextInt();

        System.out.print("Digite um número real: ");
        double num3 = scan.nextDouble();

        // a) produto do dobro do primeiro com metade do segundo
        double resultadoA = (num1 * 2) * (num2 / 2.0);

        // b) soma do triplo do primeiro com o terceiro
        double resultadoB = (num1 * 3) + num3;

        // c) terceiro elevado ao cubo
        double resultadoC = num3 * num3 * num3;

        // Saída
        System.out.println("\nResultados:");
        System.out.println("a) " + resultadoA);
        System.out.println("b) " + resultadoB);
        System.out.println("c) " + resultadoC);
    }
}

package com.peu.cursojava.Ex07;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado: ");
        double lado = scan.nextDouble();

        double res = lado * lado * 2;

        System.out.println("A área do quadrado multiplicado por 2: " + res);
    }
}

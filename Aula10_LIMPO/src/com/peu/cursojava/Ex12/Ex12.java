package com.peu.cursojava.Ex12;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        Double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal seria de: " + pesoIdeal);
    }
}

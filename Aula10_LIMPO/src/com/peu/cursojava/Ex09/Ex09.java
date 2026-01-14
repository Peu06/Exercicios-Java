package com.peu.cursojava.Ex09;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus farenheit: ");
        double fare = scan.nextDouble();

        double celsius = (5 * ( fare - 32 ) / 9 );

        System.out.println(celsius);
    }
}

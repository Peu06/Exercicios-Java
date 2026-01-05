package com.peu.cursojava.Ex10;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus celsius: ");
        double celsius = scan.nextDouble();

        double fare = (celsius * 9.0 / 5.0) + 32;

        System.out.println(fare);
    }
}

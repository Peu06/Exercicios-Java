package com.peu.cursojava.Ex03;

import java.util.Scanner;


public class Ex03 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scan.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = scan.nextInt();

        System.out.println("O resultado da soma é " + num1 + num2);
    }
}
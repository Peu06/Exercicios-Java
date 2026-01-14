package com.peu.cursojava.Ex04;

import java.util.Scanner;


public class Ex04 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota da P1: ");
        int p1 = scan.nextInt();

        System.out.println("Digite a nota da P2: ");
        int p2 = scan.nextInt();

        System.out.println("Digite a nota da P3: ");
        int p3 = scan.nextInt();

        System.out.println("Digite a nota da P4: ");
        int p4 = scan.nextInt();

        double media = (double) (p1 + p2 + p3 + p4) /4;

        System.out.println("A sua média é de: " + media);
    }
}
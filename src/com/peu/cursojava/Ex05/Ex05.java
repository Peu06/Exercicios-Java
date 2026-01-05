package com.peu.cursojava.Ex05;

import java.util.Scanner;


public class Ex05 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor em metro: ");
        int metro = scan.nextInt();

        int cent = metro * 100;

        System.out.println("O valor em centimetros é: " + cent + "cm");
    }
}
package com.peu.cursojava.Ex06;

import java.util.Scanner;

public class Ex06 {
    public void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do raio em cm: ");
        double raio = scan.nextDouble();

        double area = raio * raio * 3.14;

        System.out.println("A área é de: " + area + "cm²");
    }
}

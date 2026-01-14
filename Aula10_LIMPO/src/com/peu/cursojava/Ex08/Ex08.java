package com.peu.cursojava.Ex08;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual valor da sua hora: ");
        int valor = scan.nextInt();

        System.out.println("Horas trabalhadas no mês: ");
        int hora = scan.nextInt();

        System.out.println("Valor a receber no mês: R$" + valor * hora);
    }
}
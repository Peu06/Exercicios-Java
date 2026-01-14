package com.peu.cursojava.Ex13;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = scan.nextDouble();

        System.out.println("Digite seu sexo: ");
        System.out.println("1 - Masculino ");
        System.out.println("2 - Feminino ");
        int sexo = scan.nextInt();

        if (sexo == 1){
            double pesoIdealM = ((72.7 * altura) - 58);
            System.out.println("Seu peso ideal é de: " + pesoIdealM);
            if(pesoIdealM <= peso){
                System.out.println("Você está acima do peso");
            }else{
                System.out.println("Você está com o peso ideal");
            }
        } else if (sexo == 2) {
            double pesoIdealF = ((62.1 * altura) - 44.7);
            System.out.println("Seu peso ideal é de: " + pesoIdealF);
            if(pesoIdealF <= peso){
                System.out.println("Você está acima do peso");
            }else{
                System.out.println("Você está com o peso ideal");
            }
        }else{
            System.out.println("Sexo inválido, tente novamente.");
        }
    }
}

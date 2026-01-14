package com.peu.cursojava.Ex17;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

            System.out.print("Digite o valor em m² da área a ser pintada: ");
            double area = scan.nextDouble();

            double litros = (area * 1.1) / 6;

            int latas = (int) Math.ceil(litros / 18);
            double precoLatas = latas * 80;

            int galoes = (int) Math.ceil(litros / 3.6);
            double precoGaloes = galoes * 25;

            int latasMistura = (int) (litros / 18);
            double litrosRestantes = litros - (latasMistura * 18);

            int galoesMistura = 0;
                if (litrosRestantes > 0) {
                    galoesMistura = (int) Math.ceil(litrosRestantes / 3.6);
            }

            double precoMistura = (latasMistura * 80) + (galoesMistura * 25);

                System.out.println("\nApenas latas:");
                System.out.println(latas + " latas - Preço: R$ " + precoLatas);

                System.out.println("\nApenas galões:");
                System.out.println(galoes + " galões - Preço: R$ " + precoGaloes);

                System.out.println("\nMistura:");
                System.out.println(latasMistura + " latas e " + galoesMistura + " galões - Preço: R$ " + precoMistura);
            scan.close();
    }
}

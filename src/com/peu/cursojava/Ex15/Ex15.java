package com.peu.cursojava.Ex15;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual valor da sua hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Horas trabalhadas no mês: ");
        double horaMes = scan.nextDouble();

        double salarioBruto = valorHora * horaMes;
        double ir = (salarioBruto / 100) * 11;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double salarioLiquido = (((salarioBruto - ir)-inss)-sindicato);

        System.out.println("Salario bruto: R$" + salarioBruto);
        System.out.println("Pago ao INSS: R$" + inss);
        System.out.println("Pago ao sindicato: R$" + sindicato);
        System.out.println("Salario liquido: R$" + salarioLiquido);
    }
}
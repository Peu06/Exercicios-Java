package Ex25;

import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int contador = 0;

        System.out.println("Use S para sim e N para não;");
        System.out.print("Telefonou para a vítima? ");
        String condicao1 = scan.next().toUpperCase();
        if (condicao1.equals("S")){
            contador++;
        }
        System.out.print("Esteve no local do crime? ");
        String condicao2 = scan.next().toUpperCase();
        if (condicao2.equals("S")){
            contador++;
        }
        System.out.print("Mora perto da vítima? ");
        String condicao3 = scan.next().toUpperCase();
        if(condicao3.equals("S")){
            contador++;
        }
        System.out.print("Devia para a vítima? ");
        String condicao4 = scan.next().toUpperCase();
        if(condicao4.equals("S")){
            contador++;
        }
        System.out.print("Já trabalhou com a vítima? ");
        String condicao5 = scan.next().toUpperCase();
        if (condicao5.equals("S")){
            contador++;
        }

        if (contador == 2){
            System.out.println("Suspeito.");
        } else if (contador == 3 || contador == 4) {
            System.out.println("Cúmplice");
        } else if (contador == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}

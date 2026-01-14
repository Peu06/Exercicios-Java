package Ex26;

import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double valorSemDesconto;
        double valorComDesconto;

        System.out.print("Litros de combustivel vendido: ");
        double litros = scan.nextDouble();
        System.out.println("A para álcool");
        System.out.println("G para gasolina");
        System.out.print("Tipo de combustível: ");
        String combustivel = scan.next().toUpperCase();

        if(combustivel.equals("A")) {
            valorSemDesconto = litros * 1.9;
            if(litros > 20){
                valorComDesconto = valorSemDesconto * 0.97;
                System.out.print("Valor a pagar: R$" + valorComDesconto);
            } else{
                valorComDesconto = valorSemDesconto * 0.95;
                System.out.print("Valor a pagar: R$" + valorComDesconto);
            }
        } else if (combustivel.equals("G")) {
            valorSemDesconto = litros * 2.5;
            if(litros > 20){
                valorComDesconto = valorSemDesconto * 0.96;
                System.out.print("Valor a pagar: R$" + valorComDesconto);
            }else {
                valorComDesconto = valorSemDesconto * 0.94;
                System.out.print("Valor a pagar: R$" + valorComDesconto);
            }
        }else {
            System.out.print("Tipo de combustível invalido.");
        }
    }
}

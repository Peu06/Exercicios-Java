package Ex02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        if(num < 0){
            System.out.print("O número é negativo.");
        }else if(num > 0){
            System.out.print("O número é positivo.");
        }else{
            System.out.print("O número é igual a 0");
        }
    }
}

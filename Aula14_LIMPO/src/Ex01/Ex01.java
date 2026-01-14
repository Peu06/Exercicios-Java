package Ex01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = scan.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.print(num1 + " é maior que " + num2);
        }else if(num1 < num2){
            System.out.print(num2 + " é maior que " + num1);
        }else{
            System.out.print("Os números tem o mesmo valor");
        }



    }

}

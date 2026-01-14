package Ex09;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = scan.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = scan.nextInt();

        System.out.print("Digite outro número: ");
        int num3 = scan.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.print(num3 + ", " + num2 + ", " + num1);
        } else if (num1 < num3 && num3 < num2) {
            System.out.print(num2 + ", " + num3 + ", " + num1);
        } else if (num2 < num1 && num1 < num3) {
            System.out.print(num3 + ", " + num1 + ", " + num2);
        } else if (num2 < num3 && num3 < num1) {
            System.out.print(num1 + ", " + num3 + ", " + num2);
        } else if (num3 < num2 && num2 < num1) {
            System.out.print(num1 + ", " + num2 + ", " + num3);
        } else if (num3 < num1 && num1 < num2) {
            System.out.print(num2 + ", " + num1 + ", " + num3);
        }else {
            System.out.print("Algum dos números digitados são iguais.");
        }
    }
}

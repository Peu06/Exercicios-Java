package Ex04;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = scan.next().toUpperCase();

        if(letra.length() != 1 || !letra.matches("[A-Z]")){
            System.out.print("Valor digitado não é uma letra");
        }else{
            switch (letra) {
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.print("Vogal");
                    break;
                default:
                    System.out.print("Consoante");
            }

        }
    }
}

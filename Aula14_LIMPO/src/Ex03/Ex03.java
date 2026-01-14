package Ex03;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("F para feminino.");
        System.out.println("M para masculino.");
        System.out.print("Informe seu sexo: ");
        String sexo = scan.next().toUpperCase();

        if(sexo.equals("M")){
            System.out.print("Masculino");
        }else if(sexo.equals("F")){
            System.out.print("Feminino");
        }else{
            System.out.print("Gambiarra do capeta");
        }
    }
}

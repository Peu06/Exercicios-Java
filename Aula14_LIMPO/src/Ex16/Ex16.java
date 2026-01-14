package Ex16;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        double valorA = scan.nextDouble();

        if (valorA != 0){
            System.out.print("Informe o valor de B: ");
            double valorB = scan.nextDouble();

            System.out.print("Informe o valor de C: ");
            double valorC = scan.nextDouble();

            double delta = valorB * valorB - 4 * valorA * valorC;

            if (delta < 0){
                System.out.println("Não existem raízes reais.");
            } else if (delta > 0) {
                double raiz1 = (-valorB + Math.sqrt(delta)) / (2 * valorA);

                double raiz2 = (-valorB - Math.sqrt(delta)) / (2 * valorA);

                System.out.println("Valores da raizes: " + raiz1 + " e " + raiz2);
            }else {
                System.out.println("Valor da raiz: " + (-valorB) / (2 * valorA));
            }

        } else if (valorA == 0) {
            System.out.println("A equação não é de segundo grau, digite o valor de A diferente de 0.");
        }
    }
}

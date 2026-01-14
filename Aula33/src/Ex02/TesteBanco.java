package Ex02;

import java.util.Scanner;

public class TesteBanco {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Banco conta1 = new Banco();
        conta1.setIdConta("12345");
        conta1.setEspecial(true);
        conta1.setLimiteEspecial(500);
        conta1.setSaldo(0);

        while(true){
            System.out.println("Conta: " + conta1.getIdConta());
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Usando saldo especial?");
            System.out.println("5 - Sair do app");
            System.out.println("Digite a operação que deseja realizar: ");
            int operacao = scan.nextInt();
            if (operacao == 1) {
                System.out.println("Digite o valor do deposito: ");
                double valorDeposito = scan.nextDouble();
                conta1.depositar(valorDeposito);
            } else if (operacao == 2) {
                System.out.println("Digite o valor do saque: ");
                double valorSaque = scan.nextDouble();
                conta1.saque(valorSaque);
            } else if (operacao == 3) {
                conta1.consultarSaldo();
            } else if(operacao == 4){
                if (conta1.verificarChequeEspecial()){
                    System.out.println("Você está usando o cheque especial.");
                } else {
                    System.out.println("Você não está usando o cheque especial.");
                }
            } else if (operacao == 5) {
                break;
            } else {
                System.out.println("Operação invalida. Tente novamente.");
            }
        }
    }
}
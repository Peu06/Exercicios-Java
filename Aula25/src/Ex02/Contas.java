package Ex02;

public class Contas {
    String numConta;
    private double saldo;
    boolean especial;
    double limite;

    void saque(double valorSaque) {
        if (valorSaque <= saldo) {
            saldo -= valorSaque;
            System.out.println("Saque feito com sucesso. Novo saldo: R$" + saldo);
        }else{
            System.out.println("Saque invalido, total de saldo: R$" + saldo);
        }
    }

    void depositar(double valorDeposito) {
        System.out.println("Deposito de R$" + valorDeposito + " realizado.");
        saldo += valorDeposito;
    }

    void consultarSaldo(){
        System.out.println("Saldo: R$" + saldo);
    }
}

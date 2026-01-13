package Ex02;

public class TesteContas {

    public static void main(String[]args){

        Contas conta1 = new Contas();

        conta1.numConta = "12345";
        conta1.especial = true;
        conta1.limite = 500;
        conta1.saldo = 1000;

        conta1.depositar(600);

        conta1.saque(1000);

        conta1.consultarSaldo();


    }
}

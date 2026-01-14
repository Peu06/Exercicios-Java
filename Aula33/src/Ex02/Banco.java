package Ex02;

public class Banco {

    private String idConta;
    private double saldo;
    private double limiteEspecial;
    private boolean especial;

    public Banco(){
    }

    public Banco(String idConta, double saldo, double limiteEspecial, boolean especial){
        this.idConta = idConta;
        this.saldo = saldo;
        this.limiteEspecial = limiteEspecial;
        this.especial = especial;
    }


    public String getIdConta() {
        return idConta;
    }

    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }


    public boolean saque(double valorSaque){
        if (valorSaque <= saldo) {
            System.out.println("Saque realizado.");
            saldo -= valorSaque;
            return true;
        }else {
            if (especial){
                double limite = limiteEspecial + saldo;
                if (valorSaque <= limite){
                    System.out.println("Foi usado o limite especial.");
                    saldo -= valorSaque;
                    return true;
                }
                System.out.println("Saldo indisponivel");
                return false;
            }
            System.out.println("Saldo indisponivel");
            return false;
        }
    }

    public void depositar(double valorDeposito){
        if(valorDeposito > 0){
            System.out.println("Deposito realizado.");
            saldo += valorDeposito;
        } else {
            System.out.println("Valor invalido.");
        }
    }

    public boolean verificarChequeEspecial(){
        return saldo < 0;
    }

    public void consultarSaldo(){
        System.out.println("Saldo: R$" + getSaldo());
    }


}
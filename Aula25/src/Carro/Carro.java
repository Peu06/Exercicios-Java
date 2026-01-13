package Carro;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;


    //void = sem return
    void exibirAutonomia(){
        System.out.println("A autonomia maxima do carro é de: " + capCombustivel * consumoCombustivel + " km");
    }

    //tipo de dado = com return
    double obterAutonomia(){
        System.out.println("deu certo poha");
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km){

        double qtdCombustivel = km/consumoCombustivel;

        return qtdCombustivel;
    }
}

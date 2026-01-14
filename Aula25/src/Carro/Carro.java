package Carro;

public class Carro {



    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro(){}

    //Construtor
    public Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
        this.marca = marca_;
        this.modelo = modelo_;
        this.numPassageiros = numPassageiros_;
        this.capCombustivel = capCombustivel_;
        this.consumoCombustivel = consumoCombustivel_;
    }


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

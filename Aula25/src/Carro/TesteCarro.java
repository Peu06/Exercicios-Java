package Carro;

public class TesteCarro {

    public static void main(String[]args){
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 90;
        van.consumoCombustivel = 0.9;

        van.exibirAutonomia();

        System.out.println("A autonomia maxima do carro é de: " + van.obterAutonomia() + " km");

        double qtdCombustivel = van.calcularCombustivel(10);

        System.out.println(qtdCombustivel);
    }
}

package Carro;

public class TesteCarro {

    public static void main(String[]args){

        Carro van = new Carro("Fiat", "Ducato", 10, 90, 0.9);


        van.exibirAutonomia();

        System.out.println("A autonomia maxima do carro é de: " + van.obterAutonomia() + " km");

        double qtdCombustivel = van.calcularCombustivel(10);

        System.out.println(qtdCombustivel);
    }
}

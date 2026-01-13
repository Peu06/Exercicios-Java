package Ex01;

public class TesteLampada {

    public static void main(String[]args){

        Lampada lampadaQuente = new Lampada();
        Lampada lampadaFria = new Lampada();

        lampadaQuente.tempDeCor = "Quente";
        lampadaQuente.potencia = 2700;
        lampadaQuente.preco = 19.87;
        lampadaQuente.quantidadeEmEstoque = 10;
        lampadaQuente.tipos = new String[5];
        lampadaQuente.tipos[0] = "Abajur";
        lampadaQuente.tipos[1] = "Lampeões";


        lampadaFria.tempDeCor = "Fria";
        lampadaFria.potencia = 5000;
        lampadaFria.preco = 26.90;
        lampadaFria.quantidadeEmEstoque = 5;
        lampadaFria.tipos = new String[5];
        lampadaFria.tipos[0] = "Abajur";
        lampadaFria.tipos[1] = "Lampeões";

        lampadaFria.desligarLampada();

        lampadaQuente.ligarLampada();
    }
}

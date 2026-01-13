package Ex06;

public class TesteContatos {

    public static void main(String[] args){

        Contatos contato1 = new Contatos();
        contato1.nomeContato = "Kdu";
        contato1.emailContato = "kdu@email.com";

        contato1.telefonesContato = new String[4];

        contato1.telefonesContato[0] = "11956957985";
        contato1.telefonesContato[1] = "19963523788";
        contato1.telefonesContato[2] = "11588949456";
        contato1.telefonesContato[3] = "19999920346";
    }
}

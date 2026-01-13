package Ex02;

import java.util.Date;

public class TesteLivro {

    public static void main(String[]args){

        LivroBiblioteca catadorDePapel = new LivroBiblioteca();

        catadorDePapel.isbn = "9781687001054";
        catadorDePapel.autor = "Fernando Carraro";
        catadorDePapel.nome = "Catador de Papel";
        catadorDePapel.qntPaginas = 56;
        catadorDePapel.emprestado = true;
        catadorDePapel.dtEmprestimo = new Date();
        catadorDePapel.pessoaCOLivro = "Peu";
    }
}
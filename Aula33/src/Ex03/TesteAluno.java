package Ex03;

public class TesteAluno {

    public static void main(String[]args){

        Aluno a = new Aluno();
        a.setNomeAluno("João");
        a.setMatricula(12345);
        a.setCurso("ADS");

        a.adicionarMateria("POO", 8.5);
        a.adicionarMateria("Banco de Dados", 9.0);
        a.adicionarMateria("Estrutura de Dados", 6.0);

        a.mostarInfos();

        a.getMaterias();

    }
}

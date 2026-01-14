package Ex03;

public class Aluno {

    private String nomeAluno;
    private int matricula;
    private String curso;
    private Materia[] materias;
    private int indice = 0;

    public Aluno(){
        this("", 0, "");
    }

    public Aluno(String nomeAluno, int matricula, String curso){
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
        this.curso = curso;
        this.materias = new Materia[3];
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void adicionarMateria(String nomeMateria, double nota){
        if (indice < materias.length){
            materias[indice] = new Materia(nomeMateria, nota);
            indice++;
        }else{
            System.out.println("Limite de matérias atingido.");
        }
    }

    public void mostarInfos(){
        System.out.println("Nome: " + nomeAluno);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);

        for (Materia m : materias){
            if (m != null){
                if(m.getNota() >= 7){
                    System.out.println(m.getNomeMateria() + " - Aprovado - Nota: " + m.getNota());
                }else{
                    System.out.println(m.getNomeMateria() + " - Reprovado - Nota: " + m.getNota());
                }

            }
        }
    }
}

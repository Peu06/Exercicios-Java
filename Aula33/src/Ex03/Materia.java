package Ex03;

public class Materia {

    private String nomeMateria;
    private double nota;

    public Materia(String nomeMateria, double nota){
        this.nomeMateria = nomeMateria;
        this.nota = nota;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public double getNota(){
        return nota;
    }

    public void setNota(double nota){
        if (nota >= 0 && nota <= 10){
            this.nota = nota;
        }
    }
}

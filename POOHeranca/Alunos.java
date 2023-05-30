package POOHeranca;

public class Alunos extends Pessoas {
    // subclasse de pessoas
    // atributos especificos

    private int nMatricula;
    private String curso;
    private double mediaSemestre;
    private String turma;

    // MÉTODOS
    public int getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMediaSemestre() {
        return mediaSemestre;
    }

    public void setMediaSemestre(double mediaSemestre) {
        this.mediaSemestre = mediaSemestre;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    public void setRg(){           //metodo declarado na superclasse porém abstract, ou seja, tem que declarar novamente na classe; 
        String rg = "SP"+"numero";
    }
}

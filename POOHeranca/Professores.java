package POOHeranca;

public class Professores extends Pessoas {
    // subclasse de pessoas
    // atributos especificos

    private int qntdAulas;
    private String materiasDadas;

    // MÉTODOS
    public int getQntdAulas() {
        return qntdAulas;
    }

    public void setQntdAulas(int qntdAulas) {
        this.qntdAulas = qntdAulas;
    }

    public String getMateriasDadas() {
        return materiasDadas;
    }

    public void setMateriasDadas(String materiasDadas) {
        this.materiasDadas = materiasDadas;
    }

}

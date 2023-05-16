package POOHeranca;

public class Funcionarios extends Pessoas {
    // subclasse de pessoas
    // atributos especificos

    private String areaServico;
    private double horasTrabalhadas;

    // MÉTODOS
    public String getAreaServico() {
        return areaServico;
    }

    public void setAreaServico(String areaServico) {
        this.areaServico = areaServico;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}

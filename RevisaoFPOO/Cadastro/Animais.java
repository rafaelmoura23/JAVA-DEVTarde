package RevisaoFPOO.Cadastro;

public class Animais {
    //Atributos
    String porte;
    double peso;
    String proprietario;
    String nome;
    String especie;

    //metodos

    //construtor cheio
    public Animais(String porte, double peso, String proprietario, String nome, String especie) {
        this.porte = porte;
        this.peso = peso;
        this.proprietario = proprietario;
        this.nome = nome;
        this.especie = especie;
    }

    //construtor vazio
    public Animais() {
    }

    //getts and setts
    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    //metodos proprios
    
}

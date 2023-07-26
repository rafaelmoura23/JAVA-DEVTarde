package RevisaoFPOO.Cadastro;

public abstract class Animais {
    //Atributos
    double peso;
    String proprietario;
    String nome;
    String especie;

    //metodos

    //construtor vazio

    //getts and setts
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

    // printar todas as informações
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Proprietario: " + proprietario);
        System.out.println("Peso: " +peso);
        System.out.println("Especie: " +especie);
    }
    
}

package ExercicioPOO;

public class Pessoa {
     // declaração dos atributos do objeto
     private String nome;
     private int dia;
     private int mes;
     private int ano;
     private double altura;
     private int idade;

    // metodos de definição (set)
    // define ou altera o nome do estudante
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getIdade() {
        return idade-ano;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}

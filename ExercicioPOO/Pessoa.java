package ExercicioPOO;

public class Pessoa {
    // declaração dos atributos do objeto (atributos)
    private String nome;
    private int dia;
    private int mes;
    private int ano;
    private double altura;

    // construtor

    // sets and gests (métodos)
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

    // printar todas as informações
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println("Data de Nascimento: " + dia + "/" + mes + "/" + ano);
    }

    // calcula a idade da pessoa
    public void calculoIdade() {
        int idade = 0;
        if (dia >= 30 && mes <= 5) {
            idade = 2023 - ano;
        } else {
            idade = 2023 - ano - 1;
            System.out.println("A idade é: " + idade);
        }
    }
}

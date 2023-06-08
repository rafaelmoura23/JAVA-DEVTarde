package ProjectPOO;

import java.util.Random;

public class Pessoa { //superclasse
    //atruibutos de pessoa
    String nome;
    double saldo;
    String nConta;

    //gerar o Construtor
    public Pessoa(String nome, double saldo, String nConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.nConta = nConta;
    }

    //getts and setts
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getnConta() {
        return nConta;
    }

    public void setnConta(String nConta) {
        this.nConta = nConta;
    } 

    // metodo para gerar o numero da conta utilizando random
    public int nContaAleatorio(){
        Random rd = new Random();
        int numeroConta = rd.nextInt(999); //gerar um numero ate 999
        return numeroConta;
    }
}
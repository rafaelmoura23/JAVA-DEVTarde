package ProjectPOO;

public class Pessoa { 
    //atributos
    String nome;
    double saldo;
    int nDaConta;

    //metodos
    //construtor
    public Pessoa(String nome, double saldo, int nDaConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.nDaConta = nDaConta;
    }

     //getter and setters
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

    public int getnDaConta() {
        return nDaConta;
    }

    public void setnDaConta(int nDaConta) {
        this.nDaConta = nDaConta;
    }

    //outros metodos (sacar, depositar e saldo?), metodos do tipo void(vazio)
    public void deposito(double valor) { //metodo deposito, valor = valor depositado
        saldo+=valor; //o valor depositado será somado ao saldo atual
        System.out.println("Você depositou " +valor+ " Reais.");
    }

    public void saque(double valor) { // metodo saque, valor = valor que o usuario ira sacar
        if(valor>=saldo){
            System.out.println("Saldo Insuficiente para Sacar");
        } else{
            saldo-=valor;
             System.out.println("Você sacou " +valor+ " Reais." );
        }        
    }

    public void saldoAtual() {  //metodo para imprimir o saldo atual do usuario
        System.out.println("Seu saldo Atual é de: " +saldo+ " Reais.");
    }
    }
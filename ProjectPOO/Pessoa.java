package ProjectPOO;

public class Pessoa { 
    //atributos
    String nome;
    double saldo;
    int numeroConta;

    //construtor
    public Pessoa(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.numeroConta = gerarNumeroConta;
    }

    //getts and setts
    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    //outros metodos
    public void sacar(double valor) {
        if(valor>=saldo){
            System.out.println("Saldo insuficiente");
        } else{
            saldo-=valor;
            System.out.println("Você Sacou " +valor+ " Reais.");
        }
    }

    public void depositar(double valor) {
        saldo+=valor;
        System.out.println("Você Depositou " +valor+ " Reais.");    
    }

    public void saldoAtual() {
        System.out.println("Saldo Atual: " +saldo);
    }

    int gerarNumeroConta(){
        return (int) (Math.random() *10000);
    }
}
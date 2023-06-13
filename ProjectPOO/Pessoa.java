package ProjectPOO;

public class Pessoa { 
    //atributos
    String nome;
    static double saldo;
    int numeroConta;

    //construtor
    public Pessoa(String nome, double saldo) {
        this.nome = nome;
        Pessoa.saldo = saldo;
        this.numeroConta = gerarNumeroConta();
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
    public static void sacar(double valor) {
        if(valor>=saldo){
            System.out.println("Saldo insuficiente");
        } else{
            saldo-=valor;
            System.out.println("Você Sacou " +valor+ " Reais.");
        }
    }

    public static void depositar(double valor) {
        saldo+=valor;
        System.out.println("Você Depositou " +valor+ " Reais.");    
    }

    public static void saldoAtual() {
        System.out.println("Saldo Atual: " +saldo);
    }

    int gerarNumeroConta(){
        return (int) (Math.random() *10000);
    }
}

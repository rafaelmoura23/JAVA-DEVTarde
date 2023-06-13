package ProjectPOO;

public class PessoaFisica extends Pessoa{  //classe pessoFisica tem herança com a superclasse pessoa, ou seja, herda os atributos nome, ndaconta e saldo

    String cpf;

    public PessoaFisica(String nome, double saldo, String cpf) { 
        super(nome, saldo);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}

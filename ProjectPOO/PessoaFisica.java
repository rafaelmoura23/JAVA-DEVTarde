package ProjectPOO;

public class PessoaFisica extends Pessoa{  //classe pessoFisica tem herança com a superclasse pessoa, ou seja, herda os atributos nome, ndaconta e saldo

    String cpf;

    public PessoaFisica(String nome, double saldo, int nDaConta) { //super-construtor ?????
        super(nome, saldo, nDaConta);
    }

    //gett and sett de cpf

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
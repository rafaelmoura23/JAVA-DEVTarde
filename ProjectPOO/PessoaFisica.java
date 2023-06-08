package ProjectPOO;

public class PessoaFisica extends Pessoa{
    String cpf;

    public PessoaFisica(String nome, String cpf, double saldo, String nConta) { //i don't understand??????????????????????
        super(nome,saldo, nConta);
    }

    //getts and setts
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
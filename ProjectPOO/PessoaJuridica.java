package ProjectPOO;

public class PessoaJuridica extends Pessoa{
    String cnpj;

    public PessoaJuridica(String nome, String cnpj, double saldo, String nConta) { //???????????????????
        super(nome,saldo, nConta);
    }

    //getts and setts
    public String getCnpj() { 
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    } 

    
}
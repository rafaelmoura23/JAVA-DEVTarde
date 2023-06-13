package ProjectPOO;

public class PessoaJuridica extends Pessoa{ //classe pessojusridica tem herança com a superclasse pessoa, ou seja, herda os atributos nome, ndaconta e saldo

    String cnpj;

    //construtor
    public PessoaJuridica(String nome, double saldo, int nDaConta, String cnpj2) { 
        super(nome, saldo, nDaConta);
        this.cnpj = cnpj;
    }  

    //gett and sett de cnpj

    public String getCnpj() {
        return cnpj;
    }
} 
    
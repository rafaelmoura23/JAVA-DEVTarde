package ProjectPOO;

public class PessoaJuridica extends Pessoa{ //classe pessojusridica tem herança com a superclasse pessoa, ou seja, herda os atributos nome, ndaconta e saldo

    String cnpj;

    //construtor
    public PessoaJuridica(String nome, double saldo, String cnpj) { 
        super(nome, saldo);
        this.cnpj = cnpj;
    }  

    public String getCnpj() {
        return cnpj;
    }
} 
    
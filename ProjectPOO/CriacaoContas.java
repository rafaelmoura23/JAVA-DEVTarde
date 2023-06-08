package ProjectPOO;

import java.util.Scanner;

public class CriacaoContas {

    //veotor pessoas
    Pessoa[] pessoas;
    int qntdPessoas;

    //gerar construtor
    public CriacaoContas(Pessoa[] pessoas, int qntdPessoas) {
        this.pessoas = pessoas;
        this.qntdPessoas = 0;
    }

    public void pessoasFisicasCadastro(){
        Scanner sc = new Scanner(System.in);
    
        System.out.println(" Seja Bem Vindo ao Cadastro de Pessoas Físicas! ");
        System.out.println(" Vamos Iniciar o seu Cadastro! ");

        System.out.println(" Primeiramente Digite o seu Nome: ");
        String nome = sc.nextLine();

        System.out.println(" Agora Informe o seu CPF: ");
        String cpf = sc.nextLine();

        System.out.println(" Necessitamos que Informe o seu saldo Atual: ");
        double saldo = sc.nextDouble();

        System.out.println(" Obrigado pelas Informações!");
        System.out.println(" A sua conta foi cadastrada com Sucesso! ");


    }

    
    
} 
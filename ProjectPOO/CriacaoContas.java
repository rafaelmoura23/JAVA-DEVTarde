package ProjectPOO;

import java.util.Scanner;

public class CriacaoContas {
    Scanner sc = new Scanner(System.in);

    // veotor pessoas
    Pessoa[] pessoas;
    int qntdPessoas;

    // gerar construtor vazio
    public CriacaoContas() {
        pessoas = new Pessoa[10]; // definindo o tamanho do vetor
        qntdPessoas = 0;
    }

    // pedir os dados para a criação da conta fisica
    public void pessoasFisicasCadastro() {

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

    // pedir os dados para a criação da conta juridica
    public void pessoasJuridicasCadastro() {

        System.out.println(" Seja Bem Vindo ao Cadastro de Pessoas Juridicas! ");
        System.out.println(" Vamos Iniciar o Cadastro! ");

        System.out.println(" Primeiramente Digite o Nome: ");
        String nome = sc.nextLine();

        System.out.println(" Agora Informe o CNPJ: ");
        String cnpj = sc.nextLine();

        System.out.println(" Necessitamos que Informe o saldo Atual: ");
        double saldo = sc.nextDouble();

        System.out.println(" Obrigado pelas Informações!");

        System.out.println(" A Conta foi cadastrada com Sucesso! ");
    }

    // criar metodo para buscar uma pessoa pelo nome ou numero da conta
    public void encontrarConta() {
        System.out.print(" Olá! Digite o Nome da Pessoa que você está buscando:");
        String nome = sc.nextLine();

        boolean buscar = true;

        while (buscar) {
            for (int i = 0; i < qntdPessoas; i++) {
                if (pessoas[i].getNome().equals(nome)) {
                    System.out.println("A conta foi encontrada!");
                    System.out.println("Veja os detalhes Abaixo:");
                    System.out.println("Nome: " + pessoas[i].getNome());
                    System.out.println("Saldo: " + pessoas[i].getSaldo());
                    System.out.println("Número da conta: " + pessoas[i].getnConta());
                }
                buscar = false;
            }
        }
        if (!buscar) {
            System.out.println("A Pessoa não foi encontrada.");
        }

    }

    public void imprimir(){
        
    }

}
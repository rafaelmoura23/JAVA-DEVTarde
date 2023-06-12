package ProjectPOO;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner
        CriacaoContas criarConta = new CriacaoContas(); //criação de um objeto
        boolean logado = true; // declarar um boolean para enquanto for true continuar rodando o app

        System.out.println("Seja Bem vindo ao App do Banco!");

        while(logado){
            System.out.println("Para continuar escolha uma opção: \n 1- Cadastro de Pessoas Físicas;  \n 2- Cadastro de Pessoas Jurídicas; \n 3- Busca de Contas; \n 4- Sair");
            int opcaoEscolhida = sc.nextInt(); 
            System.out.println("");

            if(opcaoEscolhida == 1){
                System.out.println("Seja Bem Vindo(a) ao Cadastro de Pessoas Físicas! ");

                System.out.print("Para iniciarmos informe o seu Nome: ");
                String nomeF = sc.nextLine();

                System.out.print("A seguir Informe o seu saldo Atual: ");
                double saldoF = sc.nextDouble();

                System.out.print("Para Terminar informe o seu CPF:  ");
                String cpf = sc.nextLine();

                criarConta.cadastroFisico();

            } else if(opcaoEscolhida == 2){
                System.out.println("Seja Bem Vindo(a) ao Cadastro de Pessoas Jurídicas! ");

                System.out.print("Para iniciarmos informe o Nome: ");
                String nomeJ = sc.nextLine();

                System.out.print("A seguir Informe o saldo Atual: ");
                double saldoJ = sc.nextDouble();

                System.out.print("Para Terminar informe o CNPJ:  ");
                String cnpj = sc.nextLine();

            } else if(opcaoEscolhida == 3){

                System.out.print("Informe o nome da Pessoa ou Entidade: ");
                String buscarPessoa = sc.nextLine();
                criarConta.buscarPessoaLoop(buscarPessoa);

            } else if(opcaoEscolhida == 4){
                logado = false;
                System.out.println("Obrigado por Utilizar o App, Volte Sempre!"); 
            } else{
                System.out.println("Informe uma Opção Válida");
            }

        }


    }
}
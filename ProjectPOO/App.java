package ProjectPOO;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner

        CriacaoContas criarConta = new CriacaoContas(); //criação de um objeto

        boolean logado = true; // declarar um boolean para enquanto for true continuar rodando o app

        while (logado) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar conta");
            System.out.println("2 - Buscar conta por nome");
            System.out.println("3 - Sair");

            int opcaoEscolhida = sc.nextInt();

            if(opcaoEscolhida == 1){
                criarConta.cadastrarContas();
            } else if (opcaoEscolhida == 2){
                System.out.println("Digite o nome do Titular: ");
                String nome = sc.nextLine();
                criarConta.buscarContaNome(nome);
            } else if (opcaoEscolhida ==3){
                System.out.println("Obrigado por Utilizar o App, Volte Sempre! ");
                logado = false;
            } else {
                System.out.println("Digite uma Opção Válida!");
            }
        }
    }
}
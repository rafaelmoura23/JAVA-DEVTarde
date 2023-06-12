package ProjectPOO;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner
        CriacaoContas criar = new CriacaoContas(); //criação de um objeto
        boolean logado = true; // declarar um boolean para enquanto for true continuar rodando o app

        System.out.println("Seja Bem vindo ao App do Banco!");

        while(logado){
            System.out.println("Para continuar escolha uma opção: \n 1- Cadastro de Pessoas; \n 2- Busca de Contas; \n 3- Sair");
            int opcaoEscolhida = sc.nextInt(); 
            System.out.println("");

            if(opcaoEscolhida == 1){
                

            }
        }


    }
}
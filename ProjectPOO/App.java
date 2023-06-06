package ProjectPOO;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //criar o banco - construtor
        Banco banco1 = new Banco();

        //enquando for true o aplicativo estará rodando
        boolean logado = true;

        while(true){
            System.out.println("O Que Deseja? " +"\n1-Criar Conta"+"\n2-Buscar Conta"+"\n3-Sair do App"); //primeira parte, perguntar se deseja criar ou buscar conta
            int primeiraAcao = sc.nextInt();

            switch (primeiraAcao) {
                case 1:
                System.out.println("");
                    break;
                case 2:
                System.out.println("");
                    break;
                case 3:
                System.out.println("");
                    break;
                default:
                System.out.println("Digite um valor válido!");
                break;
            }

        }

    }
}

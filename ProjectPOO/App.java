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
            System.out.println("O Que Deseja? " +"\n1-Criar Conta"+"\n2-Buscar Conta"); //primeira parte, perguntar se deseja criar ou buscar conta
            int acao = sc.nextInt();

        }

    }
}

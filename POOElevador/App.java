package POOElevador;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Elevador pessoas1 = new Elevador();
        //criar um objeto
        //setar os objetos

        System.out.println("Inicío");

        System.out.print("Digite a Capacidade do Elevador");
        int capacidadePessoas = scanner.nextInt();

        System.out.print("Informe o número de andares: ");
        int totalAndares = scanner.nextInt();

        pessoas1.Inicializar(capacidadePessoas, totalAndares); 


        System.out.print("Porta do Elevador Aberta");
        boolean Continue = true;

        while(Continue){
            System.out.print("1-Entrar, 2-Subir, 3-Descer, 4-Sair, 5-Finish");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if(opcao==1){
                pessoas1.entrar();
            } else if(opcao==2){
                pessoas1.subir();
            } else if(opcao==3){
                pessoas1.descer();
            } else if(opcao==4){
                pessoas1.sair();
            } else if(opcao==5){
                Continue = false;
            }
        }
  }
}

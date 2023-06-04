package POOElevador;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //criar um objeto
        Elevador pessoas1 = new Elevador(0, 10, 5, 0);
        //setar os objetos

        System.out.println("Porta do Elevador Aberta");

        System.out.print("Digite a Capacidade do Elevador");
        int capacidadePessoas = scanner.nextInt();

        System.out.print("Informe o número de andares: ");
        int totalAndares = scanner.nextInt();


  }
}

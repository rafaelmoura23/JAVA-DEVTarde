package POOElevador;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Elevador pessoas1 = new Elevador();
        //criar um objeto
        //setar os objetos

        System.out.println("Porta do Elevador Aberta");

        System.out.print("Digite a Capacidade do Elevador");
        int capacidadePessoas = scanner.nextInt();

        System.out.print("Informe o número de andares: ");
        int totalAndares = scanner.nextInt();

        pessoas1.Inicializar(capacidadePessoas, totalAndares); 

        


  }
}

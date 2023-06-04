package POOElevador;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Elevador pessoas1 = new Elevador(); //criar um objeto

        // pedir a capacidade para o usuario e guardar na variavel capacidade
        System.out.print("Digite a Capacidade de Pessoas no Elevador: "); 
        int capacidadePessoas = scanner.nextInt();

        // pedir o numero de andares para o usuario e guardar na andares
        System.out.print("Informe o número de andares: ");
        int totalAndares = scanner.nextInt();

        // atribuindo os valores digitados pelo usuario para o construtor
        pessoas1.Inicializar(capacidadePessoas, totalAndares); 

        // iniciar o metodo para ficar rodando o programa até que o usuario saia
        System.out.println("Porta do Elevador Aberta");
        boolean Continue = true; //quando boolean for false então programa finaliza   [switch?]
        while(Continue){
            System.out.println("Escolha uma opção: [1]-Entrar, [2]-Subir, [3]-Descer, [4]-Sair, [5]-Finish");
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
            } else{
                System.out.println("Escolha uma opção de 1 a 5."); //se o usuario digitar algum numero fora do range então...
            }
        }
  }
}

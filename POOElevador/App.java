package POOElevador;

public class App {
    public static void main(String[] args) {
        //criar um objeto
        Elevador pessoas1 = new Elevador(0, 10, 5, 0);
        //setar os objetos
        pessoas1.entrar();
        pessoas1.subir();
        pessoas1.descer();
        pessoas1.sair();
  }
}

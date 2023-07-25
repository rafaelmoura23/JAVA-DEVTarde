package CadastroTeste;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
     //vetor de eventos   
    Cadastro evento1[] = new Cadastro[10];
    boolean cadastrar = true; 
    int cont=0;

    while(cadastrar){
        int acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma ação:"
                                                        +"\n 1-Cadastrar Evento;"
                                                        +"\n 2-Consultar Evento;"
                                                        +"\n 3-Sair."));
    }
}
}
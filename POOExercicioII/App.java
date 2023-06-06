package POOExercicioII;

import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Random rd = new Random();
        //criar um vetor para 10 objetos
        Agenda contatos[]=new Agenda[10];  //vetor de objetos que cabem 10 objetos

        //criar os objetos e preencher os atributos do objeto
        for (int i = 0; i < contatos.length; i++) {
            //criar o objeto - construtor
            contatos[i] = new Agenda(); //construtor vazio
            //preencher os atributos (sets)
            contatos[i].setNome(JOptionPane.showInputDialog("Digite o Nome: "));
            contatos[i].setIdade(i+18);
            contatos[i].setAltura(rd.nextDouble());
        }
        System.out.println();


}
}

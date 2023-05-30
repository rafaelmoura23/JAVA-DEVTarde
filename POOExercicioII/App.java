package POOExercicioII;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        //vetor de objetos
        Agenda obj[]=new Agenda[10];  //vetor de objetos que cabem 10 objetos

        for (int i = 0; i < obj.length; i++) {
            obj[i] = new Agenda(); //construindo o objeto 
            //preencher o objeto
            obj[i].setNome(JOptionPane.showInputDialog("Nome: "));
            obj[i].setIdade(JOptionPane.showInputDialog("Idade: "));
            obj[i].setAltura(JOptionPane.showInputDialog("Altura: "));
            
        }
}
}

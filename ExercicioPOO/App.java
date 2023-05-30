package ExercicioPOO;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Pessoa people1 = new Pessoa();  //criar um objeto
        people1.setNome(JOptionPane.showInputDialog("Digite sua Idade: "));
}
}

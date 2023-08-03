package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        // 
        try{
        JOptionPane.showMessageDialog(null, "Welcome to SENAI");
        String login = JOptionPane.showInputDialog("Informe seu login: ");
        String senha = JOptionPane.showInputDialog("Informe sua senha de 6 digítos: ");
        String dataNasc = JOptionPane.showInputDialog("Informe sua data de nascimento: ");   

        if(senha.length()!=6){
            throw new Exception("senha deve conter 6 digítos");
        } else if(senha.equals(login)){
            throw new Exception("senha não pode ser igual ao login");
        } else if(senha.equals(dataNasc)){
            throw new Exception("senha não pode se igual a data de nascimento");
        }
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }
}

package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        // 
       try {
            JOptionPane.showMessageDialog(null, "Welcome to SENAI");
            String login = JOptionPane.showInputDialog("Informe seu Login");
            String dataNascimento = JOptionPane.showInputDialog("Informe sua Data de Nascimento [dd/mm/aa]");
            String senha = JOptionPane.showInputDialog("Informe sua Senha de 6 Digitos");
            dataNascimento.replace("/", "");
            if (senha.length() != 6) {
                throw new Exception("Senha deve ter 6 Digitos");
            }else if(senha.equals(login)){
                throw new Exception("Senha igual Login");
            } else if(senha.equals(dataNascimento)){
                throw new Exception("Senha igual Data de Nascimento");
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

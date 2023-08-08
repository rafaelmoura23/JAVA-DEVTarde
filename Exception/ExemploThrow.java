package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        // criação de exceptions
       try {
            JOptionPane.showMessageDialog(null, "Welcome to SENAI");
            String login = JOptionPane.showInputDialog("Informe seu Login");
            String dataNascimento = JOptionPane.showInputDialog("Informe sua Data de Nascimento [dd/mm/aa]");
            String senha = JOptionPane.showInputDialog("Informe sua Senha de 6 Digitos");
            dataNascimento.replace("/", "");
            if (senha.length() != 6) {
                throw new Exception("Senha deve ter 6 Digitos");   //criação de exceptions
            }else if(senha.equals(login)){
                throw new Exception("Senha igual Login");
            } else if(senha.equals(dataNascimento)){
                throw new Exception("Senha igual Data de Nascimento");
            } else if(!senha.matches(".*[a-z]+.*") || !senha.matches(".*[A-Z]+.*") ){
                throw new Exception("falta letra minuscula ou maiuscula");
            }
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "senha", 0);
        }
    }
}

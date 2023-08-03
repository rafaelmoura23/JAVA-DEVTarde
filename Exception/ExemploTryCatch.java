package Exception;

import javax.swing.JOptionPane;

public class ExemploTryCatch {
    public static void main(String[] args) {

        //tratando as exceptions
        boolean calcular = true;
        while(calcular){
        try{
        //recebendo os dados
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um Número Inteiro"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um outro Número Inteiro"));

        //mostrando o resultado
        JOptionPane.showMessageDialog(null, "O Resultado é: " 
                                                                    +(n1+n2));
                                                                    calcular = false;
                                                                    
        }catch(Exception erro1){
            JOptionPane.showMessageDialog(null, "Erro - valor digitado não é inteiro");
            }
        }
    }
}

package Exception;

import javax.swing.JOptionPane;

public class ExemploTryCatch {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um Número Inteiro"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um outro Número Inteiro"));

        //mostrando o resultado
        JOptionPane.showMessageDialog(null, "O Resultado é = " 
                                                                    +(n1+n2));
    }
    
}

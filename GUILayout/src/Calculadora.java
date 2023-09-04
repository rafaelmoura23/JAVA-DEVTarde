import java.awt.*;
import javax.swing.*;

public class Calculadora extends JFrame {
    String valores[] = {"7", "8", "9","x", "6", "5", "4", "-", "3", "2", "1", "+", "/", "0", ".", "="};
    public Calculadora() {
        super("Calculator");
        //painel principal
        JPanel painel = new JPanel(new BorderLayout());
        this.add(painel);
        //add texto ao north
        //painel.add(new JTextArea(5,2), BorderLayout.NORTH);
        painel.add(new JTextField(15), BorderLayout.NORTH);
        //add painel2 ao centro
        JPanel painel2 = new JPanel(new GridLayout(4,4));
        painel.add(painel2, BorderLayout.CENTER);
        //preencher o painel2
        for (int i = 0; i < valores.length; i++) {
            painel2.add(new JButton(valores[i]));
        }
        //setFrame
        this.pack();
        this.setDefaultCloseOperation(2);   
        this.setVisible(true);

        //mudar o layout do JPanel Flow => Grid
        // GridLayout grid = new GridLayout(4,4); //3 linhas x 3 colunas
        // painel.setLayout(grid);
        // painel.add(new JButton("7"));
        // painel.add(new JButton("8"));
        // painel.add(new JButton("9"));
        // painel.add(new JButton("X"));

        // painel.add(new JButton("4"));
        // painel.add(new JButton("5"));
        // painel.add(new JButton("6"));
        // painel.add(new JButton("-"));

        // painel.add(new JButton("1"));
        // painel.add(new JButton("2"));
        // painel.add(new JButton("3"));
        // painel.add(new JButton("+"));

        // painel.add(new JButton("/"));
        // painel.add(new JButton("0"));
        // painel.add(new JButton("."));
        // painel.add(new JButton("="));
    }
    
}

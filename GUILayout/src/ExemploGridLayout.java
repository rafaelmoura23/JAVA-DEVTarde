<<<<<<< HEAD
import java.awt.GridLayout;

import javax.swing.*;

public class ExemploGridLayout extends JFrame {
    public ExemploGridLayout() {
        super("Janela Principal");
        JPanel painel1 = new JPanel();
        this.add(painel1);
        //mudar o layout do JPanel Flow => Grid
        GridLayout grid = new GridLayout(3,3); //3 linhas x 3 colunas
        painel1.setLayout(grid);
        //adicionar componentes no Jpanel
        for (int i = 1; i <= 9; i++) {
            painel1.add(new JButton(""+i));
        }
        //setFrame
        this.pack();
        this.setDefaultCloseOperation(2);   
        this.setVisible(true);
    }
}
=======
import java.awt.GridLayout;

import javax.swing.*;

public class ExemploGridLayout extends JFrame {
    public ExemploGridLayout() {
        super("Janela Principal");
        JPanel painel1 = new JPanel();
        this.add(painel1);
        //mudar o layout do JPanel Flow => Grid
        GridLayout grid = new GridLayout(3,3); //3 linhas x 3 colunas
        painel1.setLayout(grid);
        //adicionar componentes no Jpanel
        for (int i = 1; i <= 9; i++) {
            painel1.add(new JButton(""+i));
        }
        //setFrame
        this.pack();
        this.setDefaultCloseOperation(2);   
        this.setVisible(true);
    }
}
>>>>>>> 8c95878d829c52ccf62603370c33dfde01e5f3c8

<<<<<<< HEAD
import javax.swing.*;
import java.awt.*;

public class ExemploFlowLayout {
    public ExemploFlowLayout(){
        JFrame janela = new JFrame("Janela Principal");
        //mudar o layout padrão (Grid) => flowLayout
        FlowLayout flow = new FlowLayout();
        janela.setLayout(flow); //=> mudei o layout
        //adicionar componentes no layout
        janela.add(new JLabel("Informe o Valor:"));
        JTextField input1 = new JTextField(25);
        janela.add(input1);
        JButton botao1 = new JButton("Enviar");
        janela.add(botao1);
        //setFrame
        janela.pack();
        janela.setDefaultCloseOperation(2);   
        janela.setVisible(true);
    }
}
=======
import javax.swing.*;
import java.awt.*;

public class ExemploFlowLayout {
    public ExemploFlowLayout(){
        JFrame janela = new JFrame("Janela Principal");
        //mudar o layout padrão (Grid) => flowLayout
        FlowLayout flow = new FlowLayout();
        janela.setLayout(flow); //=> mudei o layout
        //adicionar componentes no layout
        janela.add(new JLabel("Informe o Valor:"));
        JTextField input1 = new JTextField(25);
        janela.add(input1);
        JButton botao1 = new JButton("Enviar");
        janela.add(botao1);
        //setFrame
        janela.pack();
        janela.setDefaultCloseOperation(2);   
        janela.setVisible(true);
    }
}
>>>>>>> 8c95878d829c52ccf62603370c33dfde01e5f3c8

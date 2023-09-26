import javax.swing.*;
import java.awt.*;

public class Exercicio3CardLayout extends JFrame {
    public Exercicio3CardLayout() {
        super("Exercicio3 - lista Cards & Tabs");

        // criando um painel principal
        JPanel mainPanel = new JPanel();


        //set do layout | cardLayout
        CardLayout cl = new CardLayout(); //cardLayout
        mainPanel.setLayout(cl); //setando o layout do painel principal como cardLayout

        //criando os botões
        JButton bNext1 = new JButton("Next");
        JButton bNext2 = new JButton("Next");
        JButton bNext3 = new JButton("Next");

        JButton bPrev1 = new JButton("Previous");
        JButton bPrev2 = new JButton("Previous");
        JButton bPrev3 = new JButton("Previous");

        //criando os Cards para adicionar o mainPanel
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Página Inicial"));
        card1.add(bNext1);
        //card1.add(bPrev1);

        JPanel card2 = new JPanel();
        card2.add(new JLabel("Página de Login"));
        card2.add(bNext2);
        card2.add(bPrev2);

        JPanel card3 = new JPanel();
        card3.add(new JLabel("Página Cadastro"));
        //card3.add(bNext3);
        card3.add(bPrev3);


        //adicionando os cards ao mainPanel
        mainPanel.add(card1);
        mainPanel.add(card2);
        mainPanel.add(card3);

        //set do Frame
        this.add(mainPanel);
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

        //criando ActionListener para os botões
        bNext1.addActionListener(e->{
            cl.next(mainPanel);
        });
        bNext2.addActionListener(e->{
            cl.next(mainPanel);
        });
        bNext3.addActionListener(e->{
            cl.next(mainPanel);
        });

        bPrev1.addActionListener(e->{
            cl.previous(mainPanel);
        });
        bPrev2.addActionListener(e->{
            cl.previous(mainPanel);
        });
        bPrev3.addActionListener(e->{
            cl.previous(mainPanel);
        });

        
    }
}

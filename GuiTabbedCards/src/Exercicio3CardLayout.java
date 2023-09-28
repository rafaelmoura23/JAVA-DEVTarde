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
        JButton bNext3 = new JButton("🏠");

        JButton bPrev1 = new JButton("Previous");
        JButton bPrev2 = new JButton("🏠");
        JButton bPrev3 = new JButton("Previous");

        //criando o CARD1 para adicionar o mainPanel
        JPanel card1 = new JPanel();
        JPanel card1Initial = new JPanel(new BorderLayout());
        card1.add(card1Initial);

        //Labels
        JLabel title = new JLabel("WELCOME TO MY JAVA APPLICATION!");

        //adicionando os componentes ao card1
        card1Initial.add(bNext1, BorderLayout.EAST);
        card1Initial.add(bPrev1, BorderLayout.WEST);
        card1Initial.add(title, BorderLayout.NORTH);



        //criando o CARD2 para adicionar o mainPanel
        JPanel card2 = new JPanel();
        JPanel card2Main = new JPanel(new BorderLayout());
        JPanel card2Login = new JPanel(new GridLayout(2, 2));

        JLabel title2 = new JLabel("WELCOME TO THE LOGIN PAGE!");

        //labels
        JLabel labelUser = new JLabel("User: ");
        JLabel labelPass = new JLabel("Password: ");

        //texts
        JTextField textUser = new JTextField(10);
        JTextField textPass = new JTextField(10);

        //buttons
        JButton buttonLog = new JButton("Login");

        //adicionando os componentes ao card2

       
        card2Login.add(labelUser);
        card2Login.add(textUser);
        card2Login.add(labelPass);
        card2Login.add(textPass);


        card2.add(card2Main);
        card2Main.add(title2, BorderLayout.NORTH);
        card2Main.add(card2Login, BorderLayout.CENTER);
        card2Main.add(bPrev2,BorderLayout.WEST);
        card2Main.add(bNext2,BorderLayout.EAST);
        card2Main.add(buttonLog,BorderLayout.SOUTH);






        //criando o CARD3 para adicionar o mainPanel
        JPanel card3 = new JPanel();
        JPanel cardMain = new JPanel(new BorderLayout());
        JPanel card3Cad = new JPanel(new GridLayout(3,3));


        JLabel title3 =  new JLabel("PÁGINA DE CADASTRO");
        
        
        card3.add(bNext3);
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
        this.pack();

        //criando os ActionListener para os botões
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

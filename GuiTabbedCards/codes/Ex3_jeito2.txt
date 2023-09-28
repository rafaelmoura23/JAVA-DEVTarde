import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

/**
 * Exercicio3CardLayout
 */
public class Exercicio3CardLayout extends JFrame{
    public Exercicio3CardLayout() {
        super();
        //criar um painel principal -> cardLayout
        JPanel cardJPanel = new JPanel();
        CardLayout cl = new CardLayout();
        cardJPanel.setLayout(cl);
        this.add(cardJPanel);//add ao frame
        //criar os cards
        // card1
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Home"));
        //add 2 botões ao card
        JButton hButLogin = new JButton("Login");
        JButton hButCadastro = new JButton("Cadastro");
        card1.add(hButLogin);
        card1.add(hButCadastro);
        cardJPanel.add(card1,"Home");
        // card2
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Login"));
        //add 2 botões ao card
        JButton lButHome = new JButton("Home");
        JButton lButCadastro = new JButton("Cadastro");
        card2.add(lButHome);
        card2.add(lButCadastro);
        cardJPanel.add(card2,"Login");
        // card3
        JPanel card3 = new JPanel();
        card3.add(new JLabel("Cadastro"));
        //add 3 botões ao card
        JButton cButHome = new JButton("Home");
        JButton cButLogin= new JButton("Login");
        card3.add(cButHome);
        card3.add(cButLogin);
        cardJPanel.add(card3,"Cadastro");
        //set do frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
        //tratamento de eventos para os botões
        hButLogin.addActionListener(e->{
            cl.show(cardJPanel,hButLogin.getText());
        });
        hButCadastro.addActionListener(e->{
            cl.show(cardJPanel,hButCadastro.getText());
        });
        lButHome.addActionListener(e->{
            cl.show(cardJPanel,lButHome.getText());
        });
        lButCadastro.addActionListener(e->{
            cl.show(cardJPanel,lButCadastro.getText());
        });
        cButHome.addActionListener(e->{
            cl.show(cardJPanel,cButHome.getText());
        });
        cButLogin.addActionListener(e->{
            cl.show(cardJPanel,cButLogin.getText());
        });


    }
    
    
}
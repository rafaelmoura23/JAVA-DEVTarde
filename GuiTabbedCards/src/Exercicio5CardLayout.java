import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio5CardLayout extends JFrame {
    public Exercicio5CardLayout() {
        super("Exercicio 5- Quiz");
        //Criar um Painel Principal -> cardLayout
        CardLayout cl = new CardLayout();
        JPanel mainCard = new JPanel(cl);// set do layout
        this.add(mainCard);
        //criar os Cards
        // card1 - Tela Inicial
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Jogo Quiz - Seja bem Vindo"));
        JButton but1 = new JButton("Start");//botão da card1
        mainCard.add(card1,"Start");
        //card2 - Primeira Pergunta
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Quem foi Campeão da Copa de 70"));
        JTextField resposta1 = new JTextField(20);
        card2.add(resposta1);
        JButton but2 = new JButton("Avançar");
        




    }
}

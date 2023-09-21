import javax.swing.*;
import java.awt.*;


public class ExemploCardLayout extends JFrame{
    public ExemploCardLayout(){
        super("Exemplo CardLayout");
        // Criando um painel 
        JPanel painel1 = new JPanel();
        // Criando um comboBox
        String comboBoxItens[] = {"Card1", "Card2"}; // String para comboBox
        JComboBox cb = new JComboBox(comboBoxItens); // Instanciando a comboBox
        painel1.add(cb);

        // Criando Cards
        JPanel card1 = new JPanel();
        card1.add(new JButton("Botão 1"));
        card1.add(new JButton("Botão 2"));
        card1.add(new JButton("Botão 3"));
        JPanel card2 = new JPanel();
        card2.add(new JTextField("TextField", 20));

        // Adicionando Cards a um CardsLayout
        JPanel cards = new JPanel(new CardLayout());
        cards.add(card1, "Card1");
        cards.add(card2, "Card2");
        this.add(painel1);
        painel1.add(cards);

        // Set do frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

        cb.addItemListener(e->{
            CardLayout cl = (CardLayout) (cards.getLayout());
            cl.show(cards, (String) e.getItem());
        });
    }
}
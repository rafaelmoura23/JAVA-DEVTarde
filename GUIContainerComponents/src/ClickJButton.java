import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClickJButton extends JFrame{
    //atributo
    int cont=0;
    public ClickJButton() {
        super("Click");
        JPanel painel = new JPanel();
        //criar os componentes do painel
        JButton botao1 = new JButton("Clique Aqui!");
        painel.add(botao1);
        JLabel texto1 = new JLabel("n° de cliques: ");
        painel.add(texto1);
        // evento Listener para contar os clicks
        botao1.addActionListener(e ->{
        
        cont++;
        painel.add(new JButton((""+cont)));
        texto1.setText(("nº de cliques: " + " " + cont));

        this.pack();
        });
        this.getContentPane().add(painel); //adicionar depois de ter adicionado todos os elementos ao painel
        //set do frame
        this.setDefaultCloseOperation(2);
        this.pack();
        this.setVisible(true);
    }
}

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class JFrameComponents extends JFrame {
    public JFrameComponents() {
        super("Janela Principal");
        this.setBounds(500, 250, 500, 500);
        //modicando o layout do frame (por padrão vem GridLayout)
        FlowLayout flow = new FlowLayout(); //usado para mudar o layout, usando apenas o setBounds os botões criados no fori ficam sobrepostos no tamanho do frame inteiro
        this.setLayout(flow); //usando o FlowLayout os botões ficam lado a lado
        //adicionar os componentes
        for (int i = 1; i <=10; i++) {
            this.add(new JButton(""+i)); //gerando 10 botões
        }
        //set frame
        this.setDefaultCloseOperation(2);
        this.setVisible(true);
    }
}

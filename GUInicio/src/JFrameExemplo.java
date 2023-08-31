import javax.swing.JFrame;

public class JFrameExemplo extends JFrame {
    public JFrameExemplo() {
        super("Minha Primeira Janela JFrame GUISwing"); //título
        this.setSize(500, 500); //tamanho
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //fechar
        this.setVisible(true); //true para aparecer o frame
        this.setBounds(700,200 ,500 ,500 );
        
    }

}

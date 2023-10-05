import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Exercicio2keyEvent extends JFrame{

    private JLabel letra;
    private JLabel textoCompleto;
    private JTextField caixaTexto;

    public Exercicio2keyEvent(){
        //construtor
        super("Exercicio 2 - keyEvent");
        this.setDefaultCloseOperation(2);
        this.setBounds(100,100,400,400);

        //criar o painel principal -> gridLayout 3x2
        JPanel mainPanel = new JPanel(new GridLayout(4,1));
        JPanel firstPanel = new JPanel();
        firstPanel.add(new JLabel("Letra Digitada: "));
        letra = new JLabel();
        firstPanel.add(letra);
        mainPanel.add(firstPanel);
        mainPanel.add(new JLabel("Digite seu Texto Aqui: "));
        caixaTexto = new JTextField();
        mainPanel.add(caixaTexto);
        textoCompleto = new JLabel();
        mainPanel.add(textoCompleto);

        //set frame
        this.add(mainPanel);
        this.setVisible(true);
        this.pack();

        //criar um handler
        Handler evt = new Handler();
        caixaTexto.addKeyListener(evt);


    }

    public class Handler implements KeyListener {

            @Override
            public void keyTyped(KeyEvent e) {
                char keyPressed = e.getKeyChar();
                letra.setText(""+keyPressed);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                textoCompleto.setText(caixaTexto.getText());
            }
        
            
        }
}














//         //criar os componentes

//         JLabel writeHere = new JLabel("Digite sua Letra aqui: ");
//         mainPanel.add(writeHere);

//         JTextField word = new JTextField();
//         mainPanel.add(word);

//         JLabel letraAtual = new JLabel("Letra:");
//         mainPanel.add(letraAtual);

//         JTextField textWord = new JTextField();
//         mainPanel.add(textWord);

//         JTextField text = new JTextField();
//         mainPanel.add(text);

//         JButton botao = new JButton("teste");
//         mainPanel.add(botao);

//         //set frame
//         this.setVisible(true);
//         this.pack();

//         //2ª forma : "new ActionListener" ->actionPerformed(ActionEvent)
//         botao.addKeyListener(new KeyAdapter () {
//             public void keyPressed(KeyEvent e){ 
//                 text.setText(writeHere.getText());
//             }
//         });
        
//     }
// }

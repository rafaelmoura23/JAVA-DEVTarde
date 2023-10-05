import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploNomeSobrenome extends JFrame {
    //atributos
    private JTextField caixaNome;
    private JTextField caixaSobrenome;
    private JLabel texto;

    public ExemploNomeSobrenome() {
        super("Exemplo 1 Eventos");
        this.setDefaultCloseOperation(2);
        this.setBounds(100,100,300,300);
        //criar o painel principal -> gridLayout 3x2
        JPanel mainPanel = new JPanel(new GridLayout(3,2));
        this.add(mainPanel);
        //criar os componentes
        mainPanel.add(new JLabel("Nome:"));
        caixaNome = new JTextField();
        mainPanel.add(caixaNome);
        mainPanel.add(new JLabel("Sobrenome:"));
        caixaSobrenome = new JTextField();
        mainPanel.add(caixaSobrenome);
        JButton botao = new JButton("Concatenar");
        mainPanel.add(botao);
        texto = new JLabel();
        mainPanel.add(texto);
        //set frame
        this.setVisible(true);
        this.pack();
        //tratamento de eventos (3 formas)
        //1ª forma : e->{evento} /callback
        botao.addActionListener(e->{//listener(fofoqueira)
            //evento 
            texto.setText(caixaNome.getText() + " " + caixaSobrenome.getText());
            caixaNome.setText("");
            caixaSobrenome.setText("");
        });
        //2ª forma : "new ActionListener" ->actionPerformed(ActionEvent)
        botao.addActionListener(new ActionListener() {//listener
            public void actionPerformed(ActionEvent e){
            //evento 
            texto.setText(caixaNome.getText() + " " + caixaSobrenome.getText());
            caixaNome.setText("");
            caixaSobrenome.setText("");
            }
        });
        //3ª dorma : Handler(manipulador)
        //criar uma classe para tratar o evento(handler) -> chamar o listener
        Handler evt = new Handler();
        botao.addActionListener(evt);
    }
    //criar a classe handler
    public class Handler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            //evento 
            texto.setText(caixaNome.getText() + " " + caixaSobrenome.getText());
            caixaNome.setText("");
            caixaSobrenome.setText("");
        }

    }
    
}

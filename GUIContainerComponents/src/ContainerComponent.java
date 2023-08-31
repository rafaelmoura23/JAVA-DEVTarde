import javax.swing.*;

public class ContainerComponent extends JFrame{
    public ContainerComponent() {
        super("Janela Pricipal");
        //adicionar outro container
        JPanel painel1 = new JPanel(); //jpane = container mais simples q o Jframe(sem bordas, elementos), organiza os componentes dentro, mas é invisível
        this.getContentPane().add(painel1); //adicionando o painel 1 //por padrão o layout é FlowLayout
        //adicionar componentes ao painel1
        painel1.add(new JLabel("Informe um n°")); //adicionando um campo label ao painel1
        JTextField campo1 = new JTextField("Informe o valor", 25); //adicionando um campo de texto ao painel1
        painel1.add(campo1);
        JButton botao1 = new JButton("Enviar");
        painel1.add(botao1);
        //usar um listener para excutar uma ação ao clicar em um botão
        botao1.addActionListener(e ->{
            int quant = Integer.parseInt(campo1.getText()); //receber a quantidade digitada
            for (int i = 1; i <= quant; i++) { //criação dos botões
                painel1.add(new JButton((""+i)));
            }
            this.pack(); //adequar os botões ao layout
        });
        //set frame
        this.setDefaultCloseOperation(2);
        this.pack(); //compacta os itens e deixa no tamanho necessário para caber os itens
        this.setVisible(true);
    }


}

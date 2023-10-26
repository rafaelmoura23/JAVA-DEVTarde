package View;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Model.Usuario;

public class Agendamento extends JFrame {
    // atributos
    private JTextField inputData;
    private JTextField inputHora;
    private JTextField inputUsuario;
    private JTextField inputDescription;
    private DefaultTableModel tableModel; // construção da lógica
    private JTable table; // construção visual
    private List<Usuario> agendamentos = new ArrayList<>();
    private int linhaSelecionada = -1;
    private JButton cadastrarButton, atualizarButton, apagarButton, apagarTodosButton, salvarButton;

    public Agendamento() {
        // construir minha tabela
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Data");
        tableModel.addColumn("Hora");
        tableModel.addColumn("Usuario");
        tableModel.addColumn("Description");
        table = new JTable(tableModel); // criando a tabela
        JScrollPane scrollPane = new JScrollPane(table); // adicionando a tabela ao JScrollPane para se ultrapassar o
                                                         // número de linhas ele scrolla

        // criar os componentes
        inputData = new JTextField(10);
        inputHora = new JTextField(10);
        inputUsuario = new JTextField(20);
        inputDescription = new JTextField(20);

        cadastrarButton = new JButton("Cadastrar");
        atualizarButton = new JButton("Atualizar");
        apagarButton = new JButton("Apagar");
        apagarTodosButton = new JButton("Apagar Todos");
        salvarButton = new JButton("Salvar");
    }

}

package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseEvent;

import Control.OperacoesAgendamento;
import Control.Serializacao;
import Model.Agenda;


public class Agendamento extends JPanel {
    // atributos
    private JTextField inputData;
    private JTextField inputHora;
    private JTextField inputUsuario;
    private JTextField inputDescription;
    private DefaultTableModel tableModel; // construção da lógica
    private JTable table; // construção visual
    private List<Agenda> agendas = new ArrayList<>();
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

        // adicionar os componentes
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Data:"));
        inputPanel.add(inputData);
        inputPanel.add(new JLabel("Hora:"));
        inputPanel.add(inputHora);
        inputPanel.add(new JLabel("Usuario:"));
        inputPanel.add(inputUsuario);
        inputPanel.add(new JLabel("Description:"));
        inputPanel.add(inputDescription);
        inputPanel.add(cadastrarButton);
        inputPanel.add(atualizarButton);
        inputPanel.add(apagarButton);
        inputPanel.add(apagarTodosButton);
        inputPanel.add(salvarButton);

        // set do layout
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        //criação do arquivo binário
        File arquivoAgenda = new File("dadosAgenda.txt");
        if (arquivoAgenda.exists()) {
            agendas = Serializacao.deserializarAgenda("dadosAgenda.txt");
            atualizarTabela();
        }

        // tratamento de eventos

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    inputData.setText((String) table.getValueAt(linhaSelecionada, 0));
                    inputHora.setText(table.getValueAt(linhaSelecionada, 1).toString());
                    inputUsuario.setText(table.getValueAt(linhaSelecionada, 2).toString());
                    inputDescription.setText(table.getValueAt(linhaSelecionada, 3).toString());

                }
            }
        });

        OperacoesAgendamento operacoes = new OperacoesAgendamento(agendas, tableModel, table);
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.cadastrarAgendamento(inputData.getText(), inputHora.getText(), inputUsuario.getText(), inputDescription.getText());
                inputData.setText("");
                inputHora.setText("");
                inputUsuario.setText("");
                inputDescription.setText("");
            }
        });

        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.atualizarAgenda(linhaSelecionada, inputData.getText(), inputHora.getText(), inputUsuario.getText(), inputDescription.getText());
            }
        });

        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarAgenda(linhaSelecionada);
            }
        });
        apagarTodosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarTodosAgenda();
            }
        });
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.salvarAgendas();
            }
        });
    }

        private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Agenda agenda : agendas) {
            tableModel.addRow(new Object[] { agenda.getData(), agenda.getHora(), agenda.getUsuario(), agenda.getDescription() });
        }
    }
    
    
}


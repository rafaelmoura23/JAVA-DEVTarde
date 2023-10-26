package Control;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Agenda;
import Model.Usuario;

public class OperacoesAgendamento {
    // atributos
    private List<Agenda> agendas;
    private DefaultTableModel tableModel;
    private JTable table;

    //construtor
        public OperacoesAgendamento(List<Agenda> agendas, DefaultTableModel tableModel, JTable table) {
        this.agendas = agendas;
        this.tableModel = tableModel;
        this.table = table;
    }

    //métodos do CRUD
    public void cadastrarAgendamento(String data, String hora, String usuario, String description) {
        Agenda agenda = new Agenda(data, hora, usuario, description); // objeto da classe usuario do package model - servindo de modelo
        agendas.add(agenda); // adicionando o objeto usuario ao List usuarios
        atualizarTabela();
    }

    public void atualizarAgenda(int linhaSelecionada, String data, String hora, String usuario, String description) {
        if (linhaSelecionada != -1) {
            Agenda agenda = new Agenda(data, hora, usuario, description);
            agendas.set(linhaSelecionada, agenda);
            atualizarTabela();
        }
    }

    public void apagarAgenda(int linhaSelecionada) {
        if (linhaSelecionada != -1) {
            agendas.remove(linhaSelecionada);
            atualizarTabela();
        }
    }

    public void apagarTodosAgenda() {
        agendas.clear();
        atualizarTabela();
    }

    // public void salvarAgendas() {
    //     Serializacao.serializar("dados.txt", agendas);
    // }

    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Agenda agenda : agendas) {
            tableModel.addRow(new Object[] { agenda.getData(), agenda.getHora(), agenda.getUsuario(), agenda.getDescription() });
        }
    }


}

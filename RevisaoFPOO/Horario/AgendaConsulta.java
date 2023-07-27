package RevisaoFPOO.Horario;

import javax.swing.JOptionPane;

public class AgendaConsulta {
    String data;
    String horario;
    String agendamento; //id único data+hora
    String cliente;
    String veterinario;

    //metodos
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getAgendamento() {
        agendamento = data+horario;
        return agendamento;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }    
}

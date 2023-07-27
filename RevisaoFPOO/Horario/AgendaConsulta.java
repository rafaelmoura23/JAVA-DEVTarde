package RevisaoFPOO.Horario;

import javax.swing.JOptionPane;

public class AgendaConsulta {
    
    public void AgendarHorario(){
        JOptionPane.showMessageDialog(null, "Escolha um horário:");
        int horario = Integer.parseInt(JOptionPane.showInputDialog(  "\n 1- 12:30hrs"
                                                                    +"\n 2- 14:20hrs"
                                                                    +"\n 3- 16:00hrs"
                                                                    +"\n 4- 17:30hrs"));
    }
}

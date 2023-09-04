import javax.swing.JTabbedPane;

public class JtabbedPane extends JTabbedPane {
    public JtabbedPane() {
        super();
        this.add("Calculadora 1", new Calculadora1()); //nome da aba e ...
        this.add("Calculadora 2", new Calculadora2());
        this.add("Calculadora 3", new Calculadora3());
    }
    
}

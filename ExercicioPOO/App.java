package ExercicioPOO;

public class App {
    public static void main(String[] args) {
        Pessoa people1 = new Pessoa();  //criar um objeto
        //people1.setNome(JOptionPane.showInputDialog("Digite sua Idade: "));
        people1.setNome("Rafael");
        people1.setAltura(1.80);
        people1.setDia(23);
        people1.setMes(10);
        people1.setAno(2003);

        people1.imprimir();

        people1.calculoIdade();
}
}

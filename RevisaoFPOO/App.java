package RevisaoFPOO;

import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Animais;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.Cachorro;

public class App {
    public static void main(String[] args) {
        Gato animal1[] = new Gato[5];
        Cachorro animal2[] = new Cachorro[5];
        boolean cadastrando = true;
        int cont1=0; //gato
        int cont2=0; //cachorro
        int cont3=0; //leao
        int cont4=0; //lebre

        while(cadastrando){
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha um Animal:"
                                                        +"\n 1-Gato"
                                                        +"\n 2-Cachorro"
                                                        +"\n 3-Leão"
                                                        +"\n 4-Lebre"
                                                        +"\n 5-Sair."));
            if(opcao==1){
                animal1[cont1] = new Gato(); //objeto
                animal1[cont1].setNome(JOptionPane.showInputDialog("Digite o Nome do Animal:"));
                animal1[cont1].setEspecie("Gato");
                
                animal1[cont1].setProprietario(JOptionPane.showInputDialog("Digite o Nome do Proprietário:"));
            }else if(opcao==2){

            }else if(opcao==5){
                cadastrando = false;
                JOptionPane.showMessageDialog(null,"Cadastro Efetuado");
            } else{
                JOptionPane.showMessageDialog(null,"Informe uma opção válida!");
            }                                                
        }
    }
}

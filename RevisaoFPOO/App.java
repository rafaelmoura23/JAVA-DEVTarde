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
                animal1[cont1].setPeso(100);
                animal1[cont1].setnVidas(JOptionPane.showInputDialog("Digite o Número de Vidas do Animal:"));
                animal1[cont1].setSalto(50);

                JOptionPane.showMessageDialog(null, "Nome do Animal: "+animal1[cont1].getNome()
                +"\n Espécie do Animal: " +animal1[cont1].getEspecie()
                +"\n Proprietário: " + animal1[cont1].getProprietario()
                +"\n Peso: " + animal1[cont1].getPeso() + " Kg"
                +"\n Número de Vidas: " + animal1[cont1].getnVidas()
                +"\n Saltos: " + animal1[cont1].getSalto()
                );

            }else if(opcao==2){
                animal2[cont2] = new Cachorro();
                animal2[cont2].setNome(JOptionPane.showInputDialog("Digite o Nome do Animal:"));
                animal2[cont2].setEspecie("Cachorro");
                animal2[cont2].setProprietario(JOptionPane.showInputDialog("Digite o Nome do Proprietário:"));
                animal2[cont2].setVolumeLatido(JOptionPane.showInputDialog("Digite o Volume do Latido em Db:"));
                animal2[cont2].setPeso(200);
                animal2[cont2].setTipo(JOptionPane.showInputDialog("Digite o Tipo de Cachorro:"));

                JOptionPane.showMessageDialog(null, "Nome do Animal: "+animal2[cont2].getNome()
                +"\n Espécie do Animal: " +animal2[cont2].getEspecie()
                +"\n Proprietário: " + animal2[cont2].getProprietario()
                +"\n Peso: " + animal2[cont2].getPeso() + " Kg"
                +"\n Volume do Latido: " + animal2[cont2].getVolumeLatido() +" Db"
                +"\n Tipo de Cachorro: " + animal2[cont2].getTipo()
                );

            }else if(opcao==5){
                cadastrando = false;
                JOptionPane.showMessageDialog(null,"Cadastro Efetuado");
            } else{
                JOptionPane.showMessageDialog(null,"Informe uma opção válida!");
            }                                                
        }
    }
}

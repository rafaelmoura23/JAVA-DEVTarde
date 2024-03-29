package RevisaoFPOO;

import javax.swing.JOptionPane;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Leao;
import RevisaoFPOO.Cadastro.Lebre;
import RevisaoFPOO.Horario.AgendaConsulta;

public class App {
    public static void main(String[] args) {
        Gato animal1[] = new Gato[5];
        Cachorro animal2[] = new Cachorro[5];
        Leao animal3[] = new Leao[5];
        Lebre animal4[]= new Lebre[5];
        boolean cadastrando = true;
        int cont1=0; //gato
        int cont2=0; //cachorro
        int cont3=0; //leao
        int cont4=0; //lebre
        int contAgenda=0; // Agenda
        AgendaConsulta agenda[] = new AgendaConsulta[10];

        JOptionPane.showMessageDialog(null, "Bem vindo ao Consultório do Dr.Veterinário!");
        while(cadastrando){
            int opcaoInicio = Integer.parseInt(JOptionPane.showInputDialog("Escolha o que quer fazer:"
                                                        +"\n 1- Cadastrar Animais"
                                                        +"\n 2- Agendar Consultas"
                                                        +"\n 3- Sair"));
            if(opcaoInicio==1){
                int opcaoDentro = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha um Animal:"
                +"\n 1-Gato"
                +"\n 2-Cachorro"
                +"\n 3-Leão"
                +"\n 4-Lebre"
                +"\n 5-Sair."));

            if(opcaoDentro ==1){
                animal1[cont1] = new Gato(); //construtor
                animal1[cont1].setNome(JOptionPane.showInputDialog("Digite o Nome do Animal:"));
                animal1[cont1].setEspecie("Gato");
                animal1[cont1].setProprietario(JOptionPane.showInputDialog("Digite o Nome do Proprietário:"));
                animal1[cont1].setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o Peso do Animal:")));
                animal1[cont1].setnVidas(JOptionPane.showInputDialog("Digite o Número de Vidas do Animal:"));
                animal1[cont1].setSalto(Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do Salto do Animal:")));

                JOptionPane.showMessageDialog(null, "Nome do Animal: "+animal1[cont1].getNome()
                +"\n Espécie do Animal: " +animal1[cont1].getEspecie()
                +"\n Proprietário: " + animal1[cont1].getProprietario()
                +"\n Peso: " + animal1[cont1].getPeso() + " Kg"
                +"\n Número de Vidas: " + animal1[cont1].getnVidas()
                +"\n Saltos: " + animal1[cont1].getSalto()
                );

                cont1++;

            }else if(opcaoDentro==2){
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

                cont2++;

            } else if(opcaoDentro==3){
                animal3[cont3] = new Leao();
                animal3[cont3].setNome(JOptionPane.showInputDialog("Digite o Nome do Animal:"));
                animal3[cont3].setEspecie("Leão");
                animal3[cont3].setProprietario(JOptionPane.showInputDialog("Digite o Nome do Proprietário:"));
                animal3[cont3].setAlmoco(JOptionPane.showInputDialog("Digite o Almoço do Leão:"));
                animal3[cont3].setPeso(300);
                animal3[cont3].setNomeSavana(JOptionPane.showInputDialog("Nome da Savana em que o Leão é Rei: "));

                JOptionPane.showMessageDialog(null, "Nome do Animal: "+animal3[cont3].getNome()
                +"\n Espécie do Animal: " +animal3[cont3].getEspecie()
                +"\n Proprietário: " + animal3[cont3].getProprietario()
                +"\n Peso: " + animal3[cont3].getPeso() + " Kg"
                +"\n Almoço do Leão: " + animal3[cont3].getAlmoco() 
                +"\n Nome da Savana: " + animal3[cont3].getNomeSavana()
                );

                cont3++;

            }else if(opcaoDentro==4){
                animal4[cont4] = new Lebre();
                animal4[cont4].setNome(JOptionPane.showInputDialog("Digite o Nome do Animal:"));
                animal4[cont4].setEspecie("Lebre");
                animal4[cont4].setProprietario(JOptionPane.showInputDialog("Digite o Nome do Proprietário:"));
                animal4[cont4].setVelocidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a Velocidade do Animal:")));;
                animal4[cont4].setPeso(400);
                animal4[cont4].setCorridasVencidas(Integer.parseInt(JOptionPane.showInputDialog("Digite o n° de corridas vencidas: :")));;


                JOptionPane.showMessageDialog(null, "Nome do Animal: "+animal4[cont4].getNome()
                +"\n Espécie do Animal: " +animal4[cont4].getEspecie()
                +"\n Proprietário: " + animal4[cont4].getProprietario()
                +"\n Peso: " + animal4[cont4].getPeso() + " Kg"
                +"\n Velocidade: " + animal4[cont4].getVelocidade() +" Km/h"
                +"\n Corridas Vencidas: " + animal4[cont4].getCorridasVencidas()
                );

                cont4++;

            }else if(opcaoDentro==5){
                cadastrando = false;
                JOptionPane.showMessageDialog(null,"Cadastro Efetuado");
            } else{
                JOptionPane.showMessageDialog(null,"Informe uma opção válida!");
            }
            } else if(opcaoInicio==2){
                JOptionPane.showMessageDialog(null,"Bem vindo(a) a Central de Agendamento de Consultas");
                
                agenda[contAgenda] = new AgendaConsulta();

                agenda[contAgenda].setData(JOptionPane.showInputDialog("Informe a Data da Consulta:"));
                agenda[contAgenda].setHorario(JOptionPane.showInputDialog("Informe o Horário da Consulta:"));
                String dataHora = agenda[contAgenda].getData() + agenda[contAgenda].getHorario();

                if(contAgenda==0){
                    agenda[contAgenda].setCliente(JOptionPane.showInputDialog("Digite o Nome do Animal:"));
                    agenda[contAgenda].setVeterinario(JOptionPane.showInputDialog("Informe o Nome do Dr.Veterinário:"));
                    JOptionPane.showMessageDialog(null, "Agendamento Efetuado com sucesso!");
                } else{
                    for (int i = 0; i < contAgenda; i++) {
                        if(agenda[i].getAgendamento().equals(dataHora)){
                            JOptionPane.showMessageDialog(null, "Agenda Indisponível, escolha outra Data!");
                            break;
                        }else{
                            agenda[contAgenda].setCliente(JOptionPane.showInputDialog("Digite o Nome do Animal:"));
                            agenda[contAgenda].setVeterinario(JOptionPane.showInputDialog("Informe o Nome do Dr.Veterinário:"));
                            JOptionPane.showMessageDialog(null, "Agendamento Efetuado com sucesso!");
                        }
                }
                }
                contAgenda++; 
                
            } else if(opcaoInicio==3){
                cadastrando = false;
                JOptionPane.showMessageDialog(null,"Até Breve!");
            } else{
                JOptionPane.showMessageDialog(null,"Informe uma opção válida!");
            }
                                                            
        }
    }
}

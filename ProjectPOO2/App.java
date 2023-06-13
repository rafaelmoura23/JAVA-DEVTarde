package ProjectPOO2;

import javax.swing.JOptionPane;

import ProjectPOO2.Conta.ContaPF;

public class App {
    public static void main(String[] args) {
        //criar um vetor das contas
        ContaPF clientePf[] = new ContaPF[10];//cleintes pf
        boolean aberta = true;
        int contPf=0;
        while(aberta){
            int acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma ação:"
                                                        +"\n 1-Criar Conta;"
                                                        +"\n 2-Acessar Conta;"
                                                        +"\n 3-Sair."));
            if(acao==1){ //criar a conta
                //criar um objeto (construtor)
                clientePf[contPf] = new ContaPF();//obj/conta esta criado
                //preencher as informações da conta
                clientePf[contPf].setNome(JOptionPane.showInputDialog("Digite o Nome do Cliente"));
                clientePf[contPf].setnCpf(JOptionPane.showInputDialog("Informe o CPF do Cliente"));
                clientePf[contPf].setSaldo(0);
                clientePf[contPf].setnConta(1000+contPf+1);
                //acrescimo do contador
                contPf++;
            } else if(acao==2){//acessar a conta
                //buscar a conta no vetor
                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da Conta a ser buscada:"));
                int contaAtual = 0;
                for (int i = 0; i < clientePf.length; i++) {
                    if(nContaBuscada==clientePf[i].getnConta()){
                        //encontrei a posição da conta no vetor
                        //preciso guardar o "i"
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null,"Cliente Encontrado");
                        break;
                    }
                }
                //entrar na conta do cliente
                boolean acessar = true;
                while (acessar) {
                    int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                        "Informe a ação desejada"
                        +"\n 1-verificar saldo"
                        +"\n 2-Saque"
                        +"\n ..."));
                        if(acao2==1){
                            JOptionPane.showMessageDialog(
                                null,clientePf[contaAtual].getSaldo());
                        }
                }


            }
        }

    }
    }


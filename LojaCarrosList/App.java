package LojaCarrosList;

import java.util.*;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        List <Carros> listaCarros = new ArrayList<>();
        ArrayList<String> listar = new ArrayList<>();
        //lista - com o tipo sendo uma classe
        //cadastrar
        //consultar
        //listar- mostrar todos que estão cadastrados
        //apagar

        boolean lojaAberta = true;
        JOptionPane.showMessageDialog(null, "Bem vindo(a) a loja de Carros!");
        while(lojaAberta){
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Opções: \n 1-Cadastrar Carro \n 2-Listar Carros \n 3-Consultar Carro \n 4-Apagar Carro \n 5-Sair"));

            if(opcao==1){
                Carros c1 = new Carros();//objeto

                c1.setMarca(JOptionPane.showInputDialog("Informe a marca do carro:"));
                c1.setModelo(JOptionPane.showInputDialog("Informe o modelo do carro:"));
                c1.setCor(JOptionPane.showInputDialog("Informe a cor do carro:"));
                c1.setAno(JOptionPane.showInputDialog("Informe o ano do carro:"));
                listaCarros.add(c1); //adicionado os carros no arrayList

            } else if(opcao==2){
                for (Carros carros : listaCarros) {
                    listar.add(carros.getMarca() + " | "+carros.getModelo() + " | " + carros.getCor() + " | " + carros.getAno() + "\n");
                }
                JOptionPane.showMessageDialog(null, listar);
                listar.clear();
            } else if(opcao==3){
                int indexCarros = Integer.parseInt(JOptionPane.showInputDialog("Informe o índice do carroque deseja consultar"));
                JOptionPane.showMessageDialog(null,listaCarros.get(indexCarros).getMarca() + "\n" 
                                                                    +listaCarros.get(indexCarros).getModelo() + "\n"
                                                                    +listaCarros.get(indexCarros).getCor() + "\n"
                                                                    +listaCarros.get(indexCarros).getAno());
            } else if(opcao==4){
                int indexCarros = Integer.parseInt(JOptionPane.showInputDialog("Informe o índice que deseja excluir"));
                listaCarros.remove(indexCarros);
            } else if(opcao==5){
                lojaAberta = false;
            } else{
                JOptionPane.showMessageDialog(null, "Informe uma opção válida");
            }

        }



        }
    
}


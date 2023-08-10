package LojaCarrosList;

import java.util.*;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        List <Carros> listaCarros = new ArrayList<>();
        String listar = "";
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
                    listar+=carros.getMarca() + " | "+carros.getModelo() + " | " + carros.getCor() + " | " + carros.getAno();
                    JOptionPane.showMessageDialog(null, listar);
                    listar = "";
                }
            } else if(opcao==3){
                String consultar = JOptionPane.showInputDialog("Informe o cadastro que deseja consultar");
                if(consultar.equals(listar)){
                    listaCarros.clear();
                }

            } else if(opcao==4){
                JOptionPane.showInputDialog("Informe o cadastro que deseja excluir");

            } else if(opcao==5){
                lojaAberta = false;
            } else{
                JOptionPane.showMessageDialog(null, "Informe uma opção válida");
            }

        }



        }
    
}


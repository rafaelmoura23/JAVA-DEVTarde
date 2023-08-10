package LojaCarrosList;

import java.util.*;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        List <Carros> listaCarros = new ArrayList<>();
        //lista - com o tipo sendo uma classe
        //cadastrar
        //consultar
        //listar- mostrar todos que estão cadastrados
        //apagar

        boolean lojaAberta = true;
        while(lojaAberta){
            JOptionPane.showMessageDialog(null, "Bem vindo(a) a loja de Carros!");
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Opções: \n 1-Cadastrar Carro \n 2-Listar Carros \n 3-Consultar Carro \n 4-Apagar Carro \n 5-Sair"));

            if(opcao==1){
                Carros c1 = new Carros();//objeto

                c1.setMarca(JOptionPane.showInputDialog("Informe a marca do carro:"));
                c1.setModelo(JOptionPane.showInputDialog("Informe o modelo do carro:"));
                c1.setCor(JOptionPane.showInputDialog("Informe a cor do carro:"));
                c1.setAno(JOptionPane.showInputDialog("Informe o ano do carro:"));
                
            } else if(opcao==2){

            } else if(opcao==3){

            } else if(opcao==4){

            } else if(opcao==5){

            }

        }



        }
    
}


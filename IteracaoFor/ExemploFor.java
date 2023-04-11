package IteracaoFor;

import java.util.Scanner;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        for(int i=1;i<=10;i++){ // int=0; i<10 => vai de 0 a 9 int=1; i<=10 => vai de 1 a 10
            System.out.println("O número da Iteração é " +i);
        }
    }

    public void exemplo2() {    //carrinho de compra
        double carrinhoCompra[] = new double[]{25.50, 55.90, 69.90, 98.75};   //vetor com os produtos
        double valorFinalCompra = 0;
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinalCompra+=carrinhoCompra[i];         //valorfinalCompra = valorFinalCompra + carrinhoCompra[i];
            System.out.println("O valor parcial da compra é R$ " +valorFinalCompra);       //printa todos os valores 
        }
        System.out.println("O valor total da compra é R$ " +valorFinalCompra);  
    }
    
}


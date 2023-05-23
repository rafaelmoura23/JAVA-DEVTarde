package FormativaJava;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {

        System.out.print("Número de Linhas: "); //digitando as linhas
        int linhas = sc.nextInt();
        System.out.print("Número de colunas: "); //digitando as colunas
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas]; //matriz linhas x colunas

        for (int i = 0; i < linhas; i++) {  //linhas 
            for (int j = 0; j < colunas; j++) {  //colunas
                matriz[i][j] = rd.nextInt(0, 9); // usando random
            }
        }

        System.out.println("Matriz Random: "); //printando a matriz random
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }

        for (int i = 0; i < linhas; i++) {   //condicionando a matriz 
            for (int j = 0; j < colunas; j++) {
                if (i>j) {                
                    matriz[i][j] = 1;          //i>j = 1
                } else if (i==j) {          
                    matriz[i][j] = 0;          //i=j = 0
                } else {
                    matriz[i][j] = 2;          //j<1 = 2
                }
            }
        }

        System.out.println("Matriz Condicionada: "); //printando a matriz condicionada
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }    

    public void exercicio2() {

        int numeroSorteado = rd.nextInt(0,10); //sortear um número de 0 a 1000
        int contTentativas=0;
        int palpite;
        boolean tenteNovamente = true;

        while(tenteNovamente){
        System.out.print("Faça seu palpite: ");
        palpite = sc.nextInt();   // pedindo o palpite para o usuário

        if(palpite>numeroSorteado){
            System.out.println("Palpite MAIOR do que o Número Sorteado!");
        } else if (palpite<numeroSorteado){
            System.out.println("Palpite MENOR do que o Número Sorteado!");
        } else{
            System.out.println("Parabéns!!! " +"O número Sorteado foi " +numeroSorteado);
            System.out.println("Você Acertou em " +(contTentativas+1)+ " Tentativas!");
            tenteNovamente=false;
        }
        contTentativas++;
    }
        
    }
}

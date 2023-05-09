import java.util.Scanner;
import java.util.Random;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1(){
        //criar preencher e manipular a matriz
        //declarar a matriz
        int matriz[][]= new int[10][9]; //vetor de duas dimensões
        //preencher minha matriz
        for(int i = 0; i < 10; i++ ){ // 1ª dimensão
            for (int j = 0; j < 9; j++) { // 2ª dimensão
                //System.out.print("matriz["+i+"]["+j+"]=");
                matriz[i][j] = rd.nextInt(10); //usando random
            }
        }
        //impressão dos elementos da matriz de forma indvidual
        for (int i = 0; i < matriz.length; i++) { // 1ª dimensão
            for (int j = 0; j < matriz[0].length; j++) { // 2ª dimensão
                System.out.println("matriz["+i+"] ["+j+"]=" +matriz[i][j]);
            }
        }
        //imprimir em formato de matriz 10x9
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] +" ");                
            }
            System.out.println("|");
        }
        int somaLinha =0; // jeito certo, soma da quarta linha
        for (int i = 0; i < matriz[3].length; i++) {
            somaLinha +=matriz[3][i];
        }
        System.out.println("A soma da 4ª Linha é: " +somaLinha); //gambiarra, soma da quarta linha
        for (int i = 0; i < 1; i++) {
            int somaGamb = matriz[3][0] + matriz[3][1] + matriz[3][2] + matriz[3][3] + matriz[3][4]+ matriz[3][5]+ matriz[3][6] + matriz[3][7] + matriz[3][8];
            System.out.println("A soma da 4ª Linha é: " +somaGamb);
        }
        int somaColuna=0;  //soma da quarta coluna
        for (int i = 0; i < matriz.length; i++) {
                somaColuna += matriz[i][3];
        }
        System.out.println("A soma da 4ª Coluna é: " +somaColuna);
    }

}


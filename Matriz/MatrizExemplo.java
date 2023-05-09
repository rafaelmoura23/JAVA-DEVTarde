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
    }
}

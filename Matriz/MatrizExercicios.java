import java.util.Scanner;
import java.util.Random;

public class MatrizExercicios {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    
    public void exercicio1() {
        int[][] matriz = new int[4][4];
        // Preencher a matriz com i * j
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = i * j;
            }
         }
        // printando o valor
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] +" ");                
            }
            System.out.println("|");
        }
    }

    public void exercicio2() {
        int matriz[][]= new int[4][4];
        // preencher a matriz 4x4 com random
        for(int i = 0; i < matriz.length; i++ ){
            for (int j = 0; j < matriz.length; j++) { 
                matriz[i][j] = rd.nextInt(10, 50); 
            }
        }
        //printar a matriz 
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] +" ");                
            }
            System.out.println("|");
        }
        // localizar o maior valor
        int maiorValor = matriz[0][0];
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
             System.out.println("O maior valor encontrado é " + maiorValor + " e está na linha " + (linha+1) + " e na coluna " + (coluna+1) + ".");
    }


    public void exercicio3() {
        int matriz[][]= new int[5][5];
        int valorX;
        for(int i = 0; i < matriz.length; i++ ){ // 1ª dimensão
            for (int j = 0; j < matriz.length; j++) { // 2ª dimensão
                matriz[i][j] = rd.nextInt(10,99); 
            }
        }
         //printar a matriz 
         for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] +" ");                
            }
            System.out.println("|");
        }
        System.out.print("Informe um valor: (10 a 99)"); // valor X a ser encontrado na matriz
        valorX = sc.nextInt();

        boolean encontrado = false;
        int linha = 0, coluna = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valorX) {
                    encontrado = true;
                    linha = i;
                    coluna = j;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }
        // Imprime a localização do valor ou mensagem de "não encontrado"
        if (encontrado) {
            System.out.print("O valor " +valorX+  " foi encontrado na linha " +linha+  " e na coluna " +coluna);
        } else {
            System.out.print("O valor " +valorX+  " não foi encontrado na matriz.");
        }
    }






    public void exercicio4() {
    }

    public void exercicio5() {
    }

    public void exercicio6() {
    }
    
}

import java.util.Scanner;
import java.util.Random;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        // criar preencher e manipular a matriz
        // declarar a matriz
        int matriz[][] = new int[10][9]; // vetor de duas dimensões
        // preencher minha matriz
        for (int i = 0; i < 10; i++) { // 1ª dimensão
            for (int j = 0; j < 9; j++) { // 2ª dimensão
                // System.out.print("matriz["+i+"]["+j+"]=");
                matriz[i][j] = rd.nextInt(10); // usando random
            }
        }
        // impressão dos elementos da matriz de forma indvidual
        for (int i = 0; i < matriz.length; i++) { // 1ª dimensão
            for (int j = 0; j < matriz[0].length; j++) { // 2ª dimensão
                System.out.println("matriz[" + i + "] [" + j + "]=" + matriz[i][j]);
            }
        }
        // imprimir em formato de matriz 10x9
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
        int somaLinha = 0; // jeito certo, soma da quarta linha
        for (int i = 0; i < matriz[3].length; i++) {
            somaLinha += matriz[3][i];
        }
        System.out.println("A soma da 4ª Linha é: " + somaLinha); // gambiarra, soma da quarta linha
        for (int i = 0; i < 1; i++) {
            int somaGamb = matriz[3][0] + matriz[3][1] + matriz[3][2] + matriz[3][3] + matriz[3][4] + matriz[3][5]
                    + matriz[3][6] + matriz[3][7] + matriz[3][8];
            System.out.println("A soma da 4ª Linha é: " + somaGamb);
        }
        int somaColuna = 0; // soma da quarta coluna
        for (int i = 0; i < matriz.length; i++) {
            somaColuna += matriz[i][3];
        }
        System.out.println("A soma da 4ª Coluna é: " + somaColuna);
    }

    public void exercicio1() { // 00, 11, 22, 33, 44, 55 if i=j => diagonal principal
        int matriz[][] = new int[5][5];
        for (int i = 0; i < matriz.length; i++) { // 1ª dimensão
            System.out.print("| ");
            for (int j = 0; j < matriz.length; j++) { // 2ª dimensão
                if (i == j || i + j == 4) {
                    matriz[i][j] = 1;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void exercicio2() {
        int matriz[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) { // 1ª dimensão
            for (int j = 0; j < matriz.length; j++) { // 2ª dimensão
                matriz[i][j] = rd.nextInt(10); // usando random
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println(" ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("|");
        }
        int somaDiagonal = 0; // soma da quarta coluna
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }
        System.out.println("A soma da Diagonal Principal é: " + somaDiagonal);
        int somaCima = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j > i) {
                    somaCima += matriz[i][j];
                }
            }
        }
        System.out.println("A soma da Parte de cima da Diagonal é: " + somaCima); // if j<i print parte de cima
        int somaBaixo = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i > j) {
                    somaBaixo += matriz[i][j];
                }
            }
        }
        System.out.println("A soma da Parte de baixo da Diagonal é: " + somaBaixo); // if j>i print parte de baixo
    }
}

// for para printar a matriz do jeito certo

// for (int i = 0; i < matriz.length; i++) {
// System.out.print("| ");
// for (int j = 0; j < matriz[0].length; j++) {
// System.out.print(matriz[j][i] +" ");
// }
// System.out.println("|");

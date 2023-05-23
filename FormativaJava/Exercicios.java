package FormativaJava;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {

        System.out.print("Número de Linhas: "); // digitando as linhas
        int linha = sc.nextInt();
        System.out.print("Número de colunas: "); // digitando as colunas
        int coluna = sc.nextInt();

        int[][] matriz = new int[linha][coluna]; // matriz linhas x colunas

        for (int i = 0; i < linha; i++) { // linhas
            for (int j = 0; j < coluna; j++) { // colunas
                matriz[i][j] = rd.nextInt(0, 9); // usando random
            }
        }

        System.out.println("Matriz Random: "); // printando a matriz random
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }

        for (int i = 0; i < linha; i++) { // condicionando a matriz
            for (int j = 0; j < coluna; j++) {
                if (i > j) {
                    matriz[i][j] = 1; // i>j = 1
                } else if (i == j) {
                    matriz[i][j] = 0; // i=j = 0
                } else {
                    matriz[i][j] = 2; // j<1 = 2
                }
            }
        }

        System.out.println("Matriz Condicionada: "); // printando a matriz condicionada
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void exercicio2() {

        int numeroSorteado = rd.nextInt(0, 1000); // sortear um número de 0 a 1000
        int palpite;
        boolean tenteNovamente = true;
        int contTentativas = 0; // contando as tentativas

        while (tenteNovamente) {
            System.out.print("Faça seu palpite: ");
            palpite = sc.nextInt(); // pedindo o palpite para o usuário

            if (palpite > numeroSorteado) { // se palpite maior do que o número sorteado
                System.out.println("Palpite MAIOR do que o Número Sorteado!");
            } else if (palpite < numeroSorteado) { // se palpite menor do que o número sorteado
                System.out.println("Palpite MENOR do que o Número Sorteado!");
            } else { // se palpite estiver certo
                System.out.println("Parabéns!!! Você Acertouu!!! " + "| O número Sorteado foi " + numeroSorteado
                        + " | Você Acertou em " + (contTentativas + 1) + " Tentativas!");
                tenteNovamente = false;
            }
            contTentativas++;
        }
    }

    public void exercicio3() {

        int sorteioVetor = rd.nextInt(100, 1000); // sortear um vetor com números de 100 a 1000

        int[] vetor = new int[sorteioVetor]; // vetor com o tamanho sorteado

        for (int i = 0; i < sorteioVetor; i++) {
            vetor[i] = rd.nextInt(1, 100); // sorteando os valores do vetor
        }
        System.out.println("Números PARES:");  
        for (int i = 0; i < vetor.length; i++) {  
            if (vetor[i] % 2 == 0) {     // numeros pares 
                System.out.print(vetor[i] + " "); //printando os números pares
            }
        }
        System.out.println(" ");
        System.out.println("Números ÍMPARES:");
        for (int i = 0; i < vetor.length; i++) {  //numeros impares
            if (vetor[i] % 2 != 0) {              //printando os números impares
                System.out.print(vetor[i] + " ");
            }
        }

    }
}

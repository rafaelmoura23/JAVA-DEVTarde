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

        boolean encontrar = false;
        int linha = 0, coluna = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valorX) {
                    encontrar = true;
                    linha = i;
                    coluna = j;
                    break;
                }
            }
        }
        // printar as mensagens
        if (encontrar) {
            System.out.print("O valor " +valorX+  " foi encontrado na linha " +linha+  " e na coluna " +coluna);
        } else {
            System.out.print("O valor " +valorX+  " não foi encontrado na matriz.");
        }
    }

    public void exercicio4() {
        int matriz[][]= new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (i<j){
                    matriz[i][j] = (2 * i) + (7 * j) - 2;
                } else if(i==j){
                    matriz[i][j] = (3 * (i * i)) - 1;
                } else{
                    matriz[i][j] = (4 * (i * i * i)) - (5 * (j * j)) + 1;
                }
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
    }
    public void exercicio5() {
        int matriz[][]= new int[5][4]; //matriz de 5 linhas e 4 colunas

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Aluno " + (i+1));

            System.out.print("Número de matrícula: ");
            matriz[i][0] = sc.nextInt();

            System.out.print("Média das provas: ");
            matriz[i][1] = sc.nextInt();

            System.out.print("Média dos trabalhos: ");
            matriz[i][2] = sc.nextInt();

            matriz[i][3] = matriz[i][1] + matriz[i][2]; // 'nota final' - 4ª coluna
        }

        int maiorNota = matriz[0][3];
        int numeroMatricula = matriz[0][0];

        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i][3] > maiorNota) {
                maiorNota = matriz[i][3];    // assume o maior valor
                numeroMatricula = matriz[i][0]; // assume o numero de matricula do maior valor
            }
        }
        // printar a matrícula do aluno com maior nota
        System.out.println("Matrícula do aluno com maior nota: " + numeroMatricula);

        //  nota final 1 + nota final 2 + nota final 3 + nota final 4 + nota final 5 / 5
        int somaNotas = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaNotas += matriz[i][3];
        }
        double mediaNotas = somaNotas / matriz.length;

        // printar a média aritmética das notas finais 
        System.out.println("Média aritmética das notas finais: " + mediaNotas);

        System.out.println(""); // printando a matriz completa
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] +" ");                
            }
            System.out.println("|");
    }
}


    public void exercicio6() {
        int A[][]= new int[3][3];
        int B[][]= new int[3][3];
        int C[][]= new int[3][3];

        // matriz A
        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("A[%d][%d] = ", i, j);
                A[i][j] = sc.nextInt();
            }
        }
        // matriz B
        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("B[%d][%d] = ", i, j);
                B[i][j] = sc.nextInt();
            }
        }
        // multiplicar a matriz A por B
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    C[i][j] = A[i][j] * B[j][i];
                }
            }
        }
        //printar a matriz  A
        for (int i = 0; i < A.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] +" ");                
            }
            System.out.println("|");
        }
        System.out.println("");
        //printar a matriz B
        for (int i = 0; i < B.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < B[0].length; j++) {
                System.out.print(B[i][j] +" ");                
            }
            System.out.println("|");
        }

        // Printar a matriz  C
        System.out.println("C = A * B:");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] +" ");
            }
            System.out.println("|");
        }
    }
    }
    

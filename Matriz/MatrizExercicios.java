import java.util.Scanner;
import java.util.Random;

public class MatrizExercicios {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    
    public void exercicio1() {
        int matriz[][]= new int[4][4];
        for(int i = 0; i < matriz.length; i++ ){ // 1ª dimensão
            for (int j = 0; j < matriz.length; j++) { // 2ª dimensão
                matriz[i][j] = rd.nextInt(10); 
            }
        }
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
        for(int i = 0; i < matriz.length; i++ ){ // 1ª dimensão
            for (int j = 0; j < matriz.length; j++) { // 2ª dimensão
                matriz[i][j] = rd.nextInt(10); 
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] +" ");                
            }
            System.out.println("|");
        }
    }

    public void exercicio3() {
    }

    public void exercicio4() {
    }

    public void exercicio5() {
    }

    public void exercicio6() {
    }
}

package IteracaoFor;

import java.util.Scanner;

public class ExerciciosFor {
    Scanner sc = new Scanner (System.in);

        public void exercicio1() {
            int vetor[] = new int[5];
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("vetor["+i+"]=");
                vetor[i] = sc.nextInt();
            }
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("vetor["+i+"]=" +vetor[i]);
            }
        }

        public void exercicio2() {  
            double vetor[] = new double[10];
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("vetor["+i+"]=");
                vetor[i] = sc.nextDouble();
            }
            for (int i = vetor.length-1; i>=0; i--) {
                System.out.println("vetor["+i+"]=" +vetor[i]);
            }  
           
    }

        public void exercicio3() {
            double vetor[] = new double[4];
            double media = 0;
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Digite as notas:");
                vetor[i] = sc.nextDouble();
            }
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Nota["+i+"]=" +vetor[i]);
            }
            for (int i = 0; i < vetor.length; i++) {
                 media+=vetor[i]/4;  
            }
            System.out.println("A média é: " +media);
    }
}



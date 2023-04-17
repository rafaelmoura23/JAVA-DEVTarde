package IteracaoFor;

import java.util.Scanner;

import ExemploVetores.Vetores;

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

        public void exercicio4() {

            } 
        public void exercicio5() {
            int vetor[] = new int[20];
            int par = 0;
            int impar = 0;
            for (int i = 0; i <vetor.length; i++) {
                System.out.println("Digite um Número:");
                vetor[i] = sc.nextInt();
            }
            for (int i = 0; i < vetor.length; i++) {
                if(vetor[i] % 2 ==0){
                    par += vetor[i];
                    System.out.println("O número " +vetor[i]+ " é par");
                }
                else{
                    impar += vetor[i];
                    System.out.println("O número " +vetor[i]+ " é impar");
                }   
            }

            
        }

        public void exercicio6() {
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
        }

        public void exercicio7() {
            
        }

        public void exercicio8() {
            

        }

        public void exercicio9() {

}
}





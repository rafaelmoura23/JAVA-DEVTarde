package ExemploVetores;

import java.util.Scanner;

public class Vetores {
    //criando metodo
    public void exemplo1() {      //metodo letra minuscula (exemplo1)  // classe primeira letra maiuscula
        //criando um vetor 
        double[] valores = new double[]{10.5,20.7,30.6,4.4};
        System.out.println("1ª posição- Índice[0]:"+valores[0]);
        System.out.println("2ª posição- Índice[1]:"+valores[1]);
        System.out.println("3ª posição- Índice[2]:"+valores[2]);
        System.out.println("4ª posição- Índice[3]:"+valores[3]);
        //Mudando valores de uma posição definida
        valores[0] = 15.6; // Mudando o valor do Índice[o]
        System.out.println("1ª Posição- Índice[0]:"+valores[0]);
    }

    public void exemplo2() {
        //criando um vetor
        int novoValores[] = new int[5];
        // int[] novoValores=new int[5];
        novoValores[0] = 10;
        novoValores[1] = 20;
        novoValores[2] = 35;
        novoValores[3] = 67;
        novoValores[4] = 98;
        System.out.println("O vetor é : posição[0]="+novoValores[0]);
        System.out.println("O vetor é : posição[1]="+novoValores[1]);
        System.out.println("O vetor é : posição[2]="+novoValores[2]);
        System.out.println("O vetor é : posição[3]="+novoValores[3]);
        System.out.println("O vetor é : posição[4]="+novoValores[4]);
}

    public void exercicio1() {
        double numerosReais[] = new double[10];
        numerosReais[0] = 25;
        numerosReais[1] = 50.7;
        numerosReais[2] = 30.9;
        numerosReais[3] = 40.77;
        numerosReais[4] = 50.4;
        numerosReais[5] = 68.5;
        numerosReais[6] = 77.7;
        numerosReais[7] = 88.6;
        numerosReais[8] = 95.6;
        numerosReais[9] = 100.5;
        System.out.println(numerosReais[9]);
        System.out.println(numerosReais[8]);
        System.out.println(numerosReais[7]);
        System.out.println(numerosReais[6]);
        System.out.println(numerosReais[5]);
        System.out.println(numerosReais[4]);
        System.out.println(numerosReais[3]);
        System.out.println(numerosReais[2]);
        System.out.println(numerosReais[1]);
        System.out.println(numerosReais[0]);
    }

    public void exercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a nota 1:");
        double nota1 = sc.nextInt();
        System.out.print("Informe a nota 2:");
        double nota2 = sc.nextInt();
        System.out.print("Informe a nota 3:");
        double nota3 = sc.nextInt();
        System.out.print("Informe a nota 4:");
        double nota4 = sc.nextInt();
        double notas[]= new double[4];
        notas[0]= nota1;
        notas[1]= nota2;
        notas[2]= nota3;
        notas[3]= nota4;
        System.out.println("nota 1 é igual a "+notas[0]);
        System.out.println("nota 2 é igual a "+notas[1]);
        System.out.println("nota 3 é igual a "+notas[2]);
        System.out.println("nota 4 é igual a "+notas[3]);
        double mediaAluno = (nota1+nota2+nota3+nota4)/4;
        System.out.println("A média do aluno é: "+mediaAluno);
    }

}

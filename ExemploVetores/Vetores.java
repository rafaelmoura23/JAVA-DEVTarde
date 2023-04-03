package ExemploVetores;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);
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
        System.out.println("Informe os Números:");
        numerosReais[0] = sc.nextDouble();
        numerosReais[1] = sc.nextDouble();
        numerosReais[2] = sc.nextDouble();
        numerosReais[3] = sc.nextDouble();
        numerosReais[4] = sc.nextDouble();
        numerosReais[5] = sc.nextDouble();
        numerosReais[6] = sc.nextDouble();
        numerosReais[7] = sc.nextDouble();
        numerosReais[8] = sc.nextDouble();
        numerosReais[9] = sc.nextDouble();
        
        System.out.println("Os números são: (Ao contrário do que foi digitado)");
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

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

    public void exemplo3() {
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

    public void exemplo4() {
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

// A partir do exercicio abaixo é a lista extra;

    public void exercicio1() {

        int vetorA[] = new int[5];
        vetorA[0] = 10;
        vetorA[1] = 20;
        vetorA[2] = 30;
        vetorA[3] = 40;
        vetorA[4] = 50;
        
        int vetorB[] = vetorA;

        System.out.println("Os Números do Vetor A São:");
        System.out.println(vetorA[0]);
        System.out.println(vetorA[1]);
        System.out.println(vetorA[2]);
        System.out.println(vetorA[3]);
        System.out.println(vetorA[4]);

        System.out.println("Os Números do Vetor B são:");
        System.out.println(vetorB[0]);
        System.out.println(vetorA[1]);
        System.out.println(vetorA[2]);
        System.out.println(vetorA[3]);
        System.out.println(vetorA[4]);
    }

    public void exercicio2() {

        int vetorA[] = new int[8];
        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 6;
        vetorA[6] = 7;
        vetorA[7] = 8;

        System.out.println("Os Números do Vetor A São:");
        System.out.println(vetorA[0]);
        System.out.println(vetorA[1]);
        System.out.println(vetorA[2]);
        System.out.println(vetorA[3]);
        System.out.println(vetorA[4]);
        System.out.println(vetorA[5]);
        System.out.println(vetorA[6]);
        System.out.println(vetorA[7]);


        int vetorB[] = new int[8];
        vetorB[0] = vetorA[0] *2;
        vetorB[1] = vetorA[1] *2;
        vetorB[2] = vetorA[2] *2;
        vetorB[3] = vetorA[3] *2;
        vetorB[4] = vetorA[4] *2;
        vetorB[5] = vetorA[5] *2;
        vetorB[6] = vetorA[6] *2;
        vetorB[7] = vetorA[7] *2;
        
        System.out.println("Os Números do Vetor B São:");
        System.out.println(vetorB[0]);
        System.out.println(vetorB[1]);
        System.out.println(vetorB[2]);
        System.out.println(vetorB[3]);
        System.out.println(vetorB[4]);
        System.out.println(vetorB[5]);
        System.out.println(vetorB[6]);
        System.out.println(vetorB[7]);
    }

    public void exercicio3() {

        int vetorA[] = new int[15];
        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 6;
        vetorA[6] = 7;
        vetorA[7] = 8;
        vetorA[8] = 9;
        vetorA[9] = 10;
        vetorA[10] = 11;
        vetorA[11] = 12;
        vetorA[12] = 13;
        vetorA[13] = 14;
        vetorA[14] = 15;

        System.out.println("Os Números do Vetor A São:");
        System.out.println(vetorA[0]);
        System.out.println(vetorA[1]);
        System.out.println(vetorA[2]);
        System.out.println(vetorA[3]);
        System.out.println(vetorA[4]);
        System.out.println(vetorA[5]);
        System.out.println(vetorA[6]);
        System.out.println(vetorA[7]);
        System.out.println(vetorA[8]);
        System.out.println(vetorA[9]);
        System.out.println(vetorA[10]);
        System.out.println(vetorA[11]);
        System.out.println(vetorA[12]);
        System.out.println(vetorA[13]);
        System.out.println(vetorA[14]);

        System.out.println("Os Números do Vetor B São:");
        System.out.println(vetorA[0]*vetorA[0]);
        System.out.println(vetorA[1]* vetorA[1]);
        System.out.println(vetorA[2]*vetorA[2]);
        System.out.println(vetorA[3]*vetorA[3]);
        System.out.println(vetorA[4]*vetorA[4]);
        System.out.println(vetorA[5]*vetorA[5]);
        System.out.println(vetorA[6]*vetorA[6]);
        System.out.println(vetorA[7]*vetorA[7]);
        System.out.println(vetorA[8]*vetorA[8]);
        System.out.println(vetorA[9]*vetorA[9]);
        System.out.println(vetorA[10]*vetorA[10]);
        System.out.println(vetorA[11]*vetorA[11]);
        System.out.println(vetorA[12]*vetorA[12]);
        System.out.println(vetorA[13]*vetorA[13]);
        System.out.println(vetorA[14]*vetorA[14]);
    }

    public void exercicio4() {

        double vetorA[] = new double[15];
        vetorA[0] = 4;
        vetorA[1] = 9;
        vetorA[2] = 16;
        vetorA[3] = 25;
        vetorA[4] = 36;
        vetorA[5] = 49;
        vetorA[6] = 64;
        vetorA[7] = 81;
        vetorA[8] = 100;
        vetorA[9] = 144;
        vetorA[10] = 169;
        vetorA[11] = 196;
        vetorA[12] = 225;
        vetorA[13] = 256;
        vetorA[14] = 289;

        System.out.println("Os Números do Vetor A São:");
        System.out.println(vetorA[0]);
        System.out.println(vetorA[1]);
        System.out.println(vetorA[2]);
        System.out.println(vetorA[3]);
        System.out.println(vetorA[4]);
        System.out.println(vetorA[5]);
        System.out.println(vetorA[6]);
        System.out.println(vetorA[7]);
        System.out.println(vetorA[8]);
        System.out.println(vetorA[9]);
        System.out.println(vetorA[10]);
        System.out.println(vetorA[11]);
        System.out.println(vetorA[12]);
        System.out.println(vetorA[13]);
        System.out.println(vetorA[14]);

        System.out.println("Os Números do Vetor B São:");
        System.out.println(Math.sqrt(vetorA[0]));
        System.out.println(Math.sqrt(vetorA[1]));
        System.out.println(Math.sqrt(vetorA[2]));
        System.out.println(Math.sqrt(vetorA[3]));
        System.out.println(Math.sqrt(vetorA[4]));
        System.out.println(Math.sqrt(vetorA[5]));
        System.out.println(Math.sqrt(vetorA[6]));
        System.out.println(Math.sqrt(vetorA[7]));
        System.out.println(Math.sqrt(vetorA[8]));
        System.out.println(Math.sqrt(vetorA[9]));
        System.out.println(Math.sqrt(vetorA[10]));
        System.out.println(Math.sqrt(vetorA[11]));
        System.out.println(Math.sqrt(vetorA[12]));
        System.out.println(Math.sqrt(vetorA[13]));
        System.out.println(Math.sqrt(vetorA[14]));
    }

}

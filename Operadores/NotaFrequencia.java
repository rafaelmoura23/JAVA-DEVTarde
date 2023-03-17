package Operadores;

import java.util.Scanner;

public class NotaFrequencia {
    Scanner sc = new Scanner(System.in);  // Scanner = Classe sc = objeto  Scanner em amarelo é p construtor e te, o mesmo nome da classe

    public void calcular(){
        System.out.print("Informe  a nota 1 do Aluno:");
        int nota1 = sc.nextInt();
        System.out.print("Informe  a nota 2 do Aluno:");
        int nota2 = sc.nextInt();
        //OperaçãoAritmética
        double mediaAluno = (nota1+nota2)/2;
        //OperaçõesAtribuição
        System.out.println("a média do Aluno é" +mediaAluno);
        //OperaçãoRelacional
        boolean mediaAprovada = mediaAluno>=50;
        System.out.println ("O aluno está aprovado por nota?" +mediaAprovada);
        System.out.println("Informe a frequência do aluno:");
        int frequenciaAluno = sc.nextInt();
        boolean frequenciaAprovada = frequenciaAluno>=75;
        System.out.println("O aluno está aprovado por frequênca?" + frequenciaAprovada);
        //Operação Lógica
        boolean resultadoFinal = (mediaAprovada==true) && (frequenciaAprovada==true);
        System.out.println ("O aluno está aprovado no curso?" +resultadoFinal);

    }
}
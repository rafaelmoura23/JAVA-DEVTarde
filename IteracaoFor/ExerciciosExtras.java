package IteracaoFor;

import java.util.Scanner;

public class ExerciciosExtras {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        boolean tenteNovamente =true;
        while(tenteNovamente)
        System.out.print("Digite o seu Usuário: ");
        String usuario = sc.nextLine();
        System.out.print("Digite a sua Senha: ");
        String senha = sc.nextLine();
        if(senha!=usuario){
            System.out.println("ACESSO PERMITIDO");
            tenteNovamente=false;
        }else{
            System.out.println("ERRO! TENTE NOVAMENTE!");
        }        
    }

    public void exercicio2() {
        System.out.print("Digite o NOME: ");
        String nome = sc.nextLine();
        System.out.print("Digite a IDADE: ");
        int idade = sc.nextInt();
        System.out.print("Digite o SALÁRIO: ");
        double salario = sc.nextDouble();
        System.out.print("Digite o SEXO: ");
        String sexo = sc.next();
        System.out.print("Digite o ESTADO CIVIL: ");
        String estadoCivil = sc.next();

        
        
    }

    public void exercicio3() {
        
    }

    public void exercicio4() {
        
    }

    public void exercicio5() {
        
    }

    public void exercicio6() {
        
    }

    public void exercicio7() {
        
    }

    public void exercicio8() {
        
    }

    public void exercicio9() {
        
    }

    public void exercicio10() {
        
    }

    public void exercicio11() {
        
    }

    public void exercicio12() {
        
    }
    
}

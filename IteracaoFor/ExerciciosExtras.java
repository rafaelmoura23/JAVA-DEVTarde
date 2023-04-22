package IteracaoFor;

import java.util.Scanner;

public class ExerciciosExtras {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.print("Digite o seu Usuário: ");
        String usuario = sc.nextLine();
        System.out.print("Digite a sua Senha: ");
        String senha = sc.nextLine();

        while(senha.equals(usuario)){  //(while) enquanto a senha for igual ao usuário print erro
            System.out.println("ERROO!!!");
            System.out.println("TENTE NOVAMENTE!!!");
            senha= sc.nextLine();
        }
        System.out.println("ACESSO PERMITIDO!"); 
    }

    public void exercicio2() {
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;
        
        System.out.println("Informe o seu NOME: ");
        nome=sc.next();
        while(nome.length()<=3) { 
    	System.out.println("Informe o seu NOME:");
    	nome=sc.next();}

        System.out.println("Informe a sua IDADE: ");
        idade=sc.nextInt();
        while(idade<0 || idade>150) { 
    	System.out.println("Informe a sua IDADE:");
    	idade=sc.nextInt();}

        System.out.println("Informe o seu SALÁRIO: ");
        salario=sc.nextDouble();
        while(salario<0) { 
    	System.out.println("Informe o seu SALÁRIO:");
    	salario=sc.nextDouble();}

        System.out.println("Informe o seu SEXO: ");
        sexo=sc.next();
        while(!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {   // equalsIgnoreCase = diferente de, porém em equals;
    	System.out.println("Informe o seu SEXO:");
    	sexo=sc.next();}

        System.out.println("Informe o seu ESTADO CIVIL: ");
        estadoCivil=sc.next();
        while(!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")) {   
    	System.out.println("Informe o seu ESTADO CIVIL:");
    	estadoCivil=sc.next();}
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

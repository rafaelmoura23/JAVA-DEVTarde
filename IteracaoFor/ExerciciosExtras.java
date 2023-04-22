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

        System.out.println("Informe o seu SEXO:  m-masculino | f-feminino ");
        sexo=sc.next();
        while(!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {   // equalsIgnoreCase = diferente de, porém em equals;
    	System.out.println("Informe o seu SEXO:");
    	sexo=sc.next();}

        System.out.println("Informe o seu ESTADO CIVIL: s-solteiro | c-casado | v-viuvo | d- divorciado");
        estadoCivil=sc.next();
        while(!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")) {   
    	System.out.println("Informe o seu ESTADO CIVIL: s-solteiro | c-casado | v-viuvo | d- divorciado");
    	estadoCivil=sc.next();}

        System.out.println("O seu NOME é: " +nome);
        System.out.println("A sua IDADE é: " +idade);
        System.out.println("O seu SALÁRIO é: " +salario);
        System.out.println("O seu SEXO é: " +sexo);
        System.out.println("O seu ESTADO CIVIL é: " +estadoCivil);
    }

    public void exercicio3() {
        
        
    }

    public void exercicio4() {
        
    }

    public void exercicio5() {
        int numeros[] = new int[8];
        int numeroMaior = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o Número " +(i+1)+ ":");
            numeros[i] = sc.nextInt();
            if(numeros[i] > numeroMaior){   // o número digitado(numeros[i]) é comparado ao valor da váriavel 'númeroMaior', quando o valor de 'números'
                numeroMaior=numeros[i];     // for maior que o valor da variavel 'numeroMaior' então o valor será guardado na variável 'numeroMaior';
        }                                   // e no final o número maior entre os números digitados será printado, ou seja, seráo ultimo guardado na variável
    }
    System.out.println("O maior número é: " + numeroMaior);
    }

    public void exercicio6() {
        
    }

    public void exercicio7() {
        
    }

    public void exercicio8() {
        System.out.println("Digite o número: ");
        int n =sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int multiplicacao = i*n;
            System.out.println(i + " X " + n + " = " + multiplicacao);
        }
    }

    public void exercicio9() {
        System.out.println("Digite o número da BASE: ");
        int base =sc.nextInt();
        System.out.println("Digite o número do EXPOENTE: ");
        int expoente =sc.nextInt();

        int operacao = 1;  // se for 0 a multiplicação será 0

        for (int i = 1; i <= expoente; i++) {
        // na primeira vez operacao recebe 1 e faz vezes a base, após isso operacao recebe o numero da operacao anterior
        // exemplo!  (base=2) e (expoente=3) operacao=1, ou seja, 2*1 = 2, após isso operacao vale 2
        //agora operacao recebe o reultado=2, ou seja, 2*2 = 4, após isso operacao vale 4
        //agora operacao recebe o resultado=4, ou seja, 2*4= 8...
        operacao = base*operacao;
            System.out.println("operação= " +operacao);
        }
        System.out.println("O número " + base + " elevado a " + expoente + " é igual a " + operacao);
    }

    public void exercicio10() {
        System.out.println("Digite o número de termos desejados: ");
        int nTermos = sc.nextInt();
        int termo1 = 0; 
        int termo2 = 1; // números inicias da sequência
        for (int i = 1; i <= nTermos; i++) {
            int nextTermos = termo1+termo2; 
            termo1=termo2;  
            termo2=nextTermos;
            System.out.println("O termo " +i+ " é: " +nextTermos );
        }
    }

    public void exercicio11() {
        System.out.print("Digite um número Inteiro: ");
        int numero = sc.nextInt();
        
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial*= i;
        }
        System.out.println("O FATORIAL de " +numero+ " é igual a " +fatorial );
    }










    public void exercicio12() {
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
        

            
        }

        
    }
    
}

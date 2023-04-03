package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicio1 {
 Scanner sc = new Scanner(System.in);
    public void exe1(){
        System.out.print("Informe o valor 1:");
        int valor1 = sc.nextInt();
        System.out.print("Informe o valor 2:");
        int valor2 = sc.nextInt();
        if (valor1>valor2){                                 // entre parenteses é a condição
        System.out.print ("O Maior valor é:" + valor1);    // syso
        }
        if (valor1<valor2){
        System.out.print ("O Maior valor é:" + valor2);
        }
    }


    public void exe2(){
        System.out.print("Informe o seu ano de Nascimento:");
        int valor1 = sc.nextInt();
        if (2023-valor1>=16){
        System.out.println("Você está APTO para votar");  
        } else {                                                   
        System.out.println("Você NÃO está apto para votar");   
        }
    }


    public void exe3(){
        System.out.print("Informe a sua Senha:");
        int valor1 = sc.nextInt();
        if (valor1==1234){
        System.out.print("Acesso PERMITIDO");   
        } else {
        System.out.print("Acesso NEGADO");
        }
    }

    public void exe4(){
        System.out.print("Total de maçãs compradas:");
        int valor1 = sc.nextInt();
        if (valor1<=11) {
            double MenosDeUmaDuzia = valor1*0.30;
            System.out.println("O Valor a Pagar é R$:" +MenosDeUmaDuzia);
        } else{
            double MaisDeUmaDuzia = valor1*0.25;
            System.out.println("O Valor a Pagar é R$:" +MaisDeUmaDuzia);
        }
    }


    public void exe5(){
        System.out.print("Informe o valor 1:");
        int valor1 = sc.nextInt();
        System.out.print("Informe o valor 2:");
        int valor2 = sc.nextInt();
        System.out.print("Informe o valor 3:");
        int valor3 = sc.nextInt();
        if(valor1<valor2 && valor2<valor3){
            System.out.print(valor1+ ","+valor2+ ","+valor3);
        } else if(valor2<valor1 && valor1<valor3){
            System.out.print(valor2 + ","+valor1+ ","+valor3);
        }
        if(valor1<valor3 && valor3<valor2){
            System.out.print(valor1 + ","+valor3+ ","+valor2);
        } else if (valor2<valor3 && valor3<valor1){
            System.out.print(valor2 + ","+valor3+ ","+valor1);
        }
        if(valor3<valor1 && valor1<valor2){
            System.out.print(valor3+ ","+valor1+ ","+valor2);
        } else if (valor3<valor2 && valor2<valor1){
            System.out.print(valor3+ ","+valor2+ ","+valor1);
        }
        }

    public void exe6(){
        System.out.print("Informe sua Altura em Metros:");
        double valor1 = sc.nextDouble();
        System.out.print("Informe o seu Sexo (Sendo 1= Masculino e 2= Feminino)");
        double valor2 = sc.nextDouble();
        if(valor2==1) {
        double PesoIdeal1=(72.7*valor1)-58;
        System.out.print("Seu Peso Ideal é Kg:" + PesoIdeal1);    
        } else{
        double PesoIdeal2 = (62.1*valor1)-58;
        System.out.print("Seu Peso Ideal é Kg:" + PesoIdeal2);
        }

    }
    

    public void exe7(){
        System.out.print("Informe  a nota 1 do Aluno:");
        Double nota1 = sc.nextDouble();
        System.out.print("Informe  a nota 2 do Aluno:");
        double nota2 = sc.nextDouble();
        double mediaAluno = (nota1+nota2)/2;
        System.out.println("Informe a frequência do aluno:");
        Double frequenciaAluno = sc.nextDouble();
        if (mediaAluno>=50 && frequenciaAluno>=75) {
            System.out.println("O Aluno está Aprovado");    
        } else{
            System.out.println("O Aluno está Reprovado");
        }
        System.out.println("a média do Aluno é:" +mediaAluno);
        System.out.println("a frequência do Aluno é:" +frequenciaAluno);
        }

        // A partir do exe8 são os exercicios da lista extra.

        public void exe8(){
        System.out.print("Informe o valor:");
        Double valor1 = sc.nextDouble();
        if (valor1 % 2==0) {
        System.out.print("O número é PAR");
        } else {
        System.out.print("O número é IMPAR");
        }
        }

        public void exe9(){
        System.out.print("Informe a Nota:");
        Double nota = sc.nextDouble();
        if(nota<5){
        System.out.print("Aluno REPROVADO");
        } else if (nota>=7){
        System.out.print("Aluno APROVADO"); 
        } else{
        System.out.print("Aluno de RECUPERAÇÃO");
        }
        }

        public void exe10(){
        System.out.print("Informe a letra:");
        String letra = sc.nextLine();
        if ( letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
        System.out.println("A letra é vogal");
        } else {
        System.out.println("A letra é consoante");
        }
    
        }
    
        public void exe11(){
        System.out.print("Informe o seu Salário:");
        Double salario = sc.nextDouble();
        if(salario<=1280){
        double aumento1 = salario*0.20;
        double salario1 = aumento1+salario;
        System.out.print("Seu salário inicial era de R$:" +salario);
        System.out.print(" ;O aumento foi de 20% ");
        System.out.print(" ;O valor do aumento foi de R$:" + aumento1);
        System.out.print(" ;O seu novo salário é de R$:" +salario1);
        } else if (salario>=1281){
        double aumento2 = salario*0.15;
        double salario2 = aumento2+salario;
        System.out.print("Seu salário inicial era de R$:" +salario);
        System.out.print(" ;O aumento foi de 15% ");
        System.out.print(" ;O valor do aumento foi de R$:" + aumento2);
        System.out.print(" ;O seu novo salário é de R$:" +salario2);
        } else if (salario>=1701){
        double aumento3 = salario*0.1;
        double salario3 = aumento3+salario;
        System.out.print("Seu salário inicial era de R$:" +salario);
        System.out.print(" ;O aumento foi de 10% ");
        System.out.print(" ;O valor do aumento foi de R$:" + aumento3);
        System.out.print(" ;O seu novo salário é de R$:" +salario3);
        } else if (salario>=2500) {
        double aumento4 = salario*0.05;
        double salario4 = aumento4+salario;
        System.out.print("Seu salário inicial era de R$:" +salario);
        System.out.print(" ;O aumento foi de 5% ");
        System.out.print(" ;O valor do aumento foi de R$:" + aumento4);
        System.out.print(" ;O seu novo salário é de R$:" +salario4);
        }
    }
}



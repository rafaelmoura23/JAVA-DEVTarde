package IteracaoFor;

import java.util.Scanner;

public class ExerciciosFor {
    Scanner sc = new Scanner (System.in);

        public void exercicio1() { //ok
            int vetor[] = new int[5];
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("vetor["+i+"]=");
                vetor[i] = sc.nextInt();
            }
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("vetor["+i+"]=" +vetor[i]);
            }
        }

        public void exercicio2() {   //ok
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
            //criar um vetor para receber as 4 notas
            double vetorNotas[] = new double[4];
            //preencher o vetor com as 4 notas "fori"
            for (int i = 0; i < vetorNotas.length; i++) {
                //pedir para digitar as notas e ler a nota digitada
                System.out.println("Digite a nota "+(i+1)+" do aluno:");
                vetorNotas[i] = sc.nextDouble();
            }
            //printar as notas e calcular a média "fori"
            double media = 0;
            for (int i = 0; i < vetorNotas.length; i++) {
                System.out.println("Nota "+(i+1)+"=" +vetorNotas[i]);
                media+=vetorNotas[i]; //acumular o valor das notas do vetor
            }
            //dividir a media pelo número de notas do vetor
            media/=vetorNotas.length;
            System.out.println("A média do Aluno é: " +media);
        }

        public void exercicio4() {   //ler 10 caracteres e contar as consoantes "k","l","m", "n", "o","p","q", "r", "s","t", "u", "v", "w","x", "y", "z"
            // criar um vetor com 10 caracteres
            String letras[] = new String[]{"a", "b", "c","d", "e", "f", "g","h","i", "j"};
            //percorrer o vetor para achar as consoantes "fori"
            int cont= 0; //contador para consoantes
            for (int i = 0; i < letras.length; i++) {
                //tomada de decisão vogal ou consoante
                if(letras[i]!="a" && letras[i]!="e" && letras[i]!="i" && letras[i]!="o" && letras[i]!="u"){
                    System.out.println(letras[i] +" é consoante");
                    cont++; //se for consoante, irá contar o número de consoantes
                }
            }
            //mostrar o número de consoantes
            System.out.println("O número de consoantes é " +cont);
        }

        public void exercicio4extra() { //contando consoantes de uma palavra
        //usuario vai digitar a palavra
        System.out.println("Digite uma palavra");
        String letras = sc.next(); // nextLine - lê a linha inteira  next - lê apenas a próxima palavra
        letras = letras.toLowerCase(); //transforma as letras em minusculas 
        //percorrer o vetor para achar as consoantes "fori"
        int cont= 0; //contador para consoantes
        for (int i = 0; i < letras.length(); i++) {
            //tomada de decisão vogal ou consoante
            char c = letras.charAt(i); //

            if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
                System.out.println(c +" é consoante");
                cont++; //se for consoante, irá contar o número de consoantes
            }
        }
        //mostrar o número de consoantes
        System.out.println("O número de consoantes é " +cont);
            
        }

        public void exercicio5() {   //determinar pares e impares em outros vetores
            int vetorNumeros[] = new int[20];
            int contPar=0; //contador de numeros pares  
            int contImpar=0; //contador de numeros impares
            //percorrer o vetor e contar os numeros pares e impares
            for (int i = 0; i <vetorNumeros.length; i++) {
                System.out.println("Digite um Número:");
                vetorNumeros[i] = sc.nextInt();
            }
            for (int i = 0; i < vetorNumeros.length; i++) {
                if(vetorNumeros[i]%2==0){
                    contPar++;  //guarda os numeros pares
                }
                else{
                    contImpar++; //guarda os numeros impares
                }   
            }   
            int nPar[] = new int[contPar];
            int nImpar[] = new int[contImpar];
            //distribuir os numeros nos vetores par e impar
            contPar=0;
            contImpar=0;
            for (int i = 0; i < vetorNumeros.length; i++) {
                if(vetorNumeros[i]%2==0){
                    nPar[contPar]=vetorNumeros[i];
                    contPar++;
                }
                else{
                    nImpar[contImpar]=vetorNumeros[i];
                    contImpar++;
                } 
            }
            for (int i = 0; i < vetorNumeros.length; i++) {
                System.out.println("vetor["+i+"]=" +vetorNumeros[i]);   
            }
            for (int i = 0; i < nPar.length; i++) {
                System.out.println("vetorPar["+i+"]=" +nPar[i]);   
            }
            for (int i = 0; i < nImpar.length; i++) {
                System.out.println("vetorImpar["+i+"]=" +nImpar[i]);   
            }
        }

        public void exercicio5extra() {    //Gambiarra
            int numeros[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
            int nPar[]= new int[numeros.length];  
            int nImpar[]= new int[numeros.length]; 
            
            }

        public void exercicio6() {
            double vetor[] = new double[4];
            double media = 0;
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Digite as notas:");
                vetor[i] = sc.nextDouble();
            }
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Número["+i+"]=" +vetor[i]);
            }
            for (int i = 0; i < vetor.length; i++) {
                media+=vetor[i]/4;
           }
        }

        public void exercicio7() {
            int vetor[] = new int[5];
            for (int i = 0; i < vetor.length; i++) {
                System.out.print("Digite os Números:");
                vetor[i] = sc.nextInt();
            }
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Número["+i+"]=" +vetor[i]);
            }
            int soma = 0;
            int mult = 1;
            for (int i = 0; i < vetor.length; i++) {
                soma+=vetor[i];
                mult*=vetor[i];
            }
            System.out.println("A multiplicação é: " +mult);
            System.out.println("A soma é: " +soma);
        }

        public void exercicio8() {  //ok
            int idades[] = new int[5];
            double alturas[] = new double[5];

            for (int i = 0; i < 5; i++) {
                System.out.print("Digite a Idade " + (i+1) + ":" );
                idades[i] = sc.nextInt();
                System.out.print("Digite a Altura:");
                alturas[i] = sc.nextDouble();
            }
            for (int i = 4; i>=0; i--) {
                System.out.println("Pessoa " + (i+1) + " - Idade: " + idades[i] + " | Altura: " + alturas[i]);
                
            }
                
            }

        public void exercicio9() {    //ok
            int vetor[] = new int[10];
            for (int i = 0; i < vetor.length; i++) {
                System.out.print("Digite os Números:");
                vetor[i] = sc.nextInt();             
            }
            int quadrado =0;
            int soma= 0;
            for (int i = 0; i < vetor.length; i++) {
                quadrado = vetor[i]*vetor[i];
                soma+=quadrado;
                }
                System.out.println("A soma dos quadrado é: " +soma);
            }
}







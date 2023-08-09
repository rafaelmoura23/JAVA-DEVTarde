package Colecoes;

import java.lang.reflect.Array;
import java.util.*;

public class ExemploArrayList {
    ArrayList <String> carros = new ArrayList<>();
    public void teste(){
        //adicionando elementos
        carros.add("Fusca");
        carros.add("Brasília");
        carros.add("Chevette");
        carros.add("Monza");
        carros.add("Monza");
        //imprimindo lista completa
        System.out.println(carros);
        //ordenando a lista(.sort(Collections))
        Collections.sort(carros);
        System.out.println(carros);
        Collections.reverse(carros); //ordenação reversa
        System.out.println(carros);
        //percorrerendo a lista(for)
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
        //percorrrendo a lista com For-each
        for (String s : carros) {
            System.out.println(s);
        }
        //limpando os elementos
        carros.clear();
        //imprimindo a lista vazia
        System.out.println(carros);
    }

    public void exercicio1(){
        //criar um arraylist de números inteiros
        //escrever 5 números aleatórios - ordenar e imprimir
        Random rd = new Random();
        ArrayList <Integer> numbers = new ArrayList<>();
        //criando os numeros aleatorios
        numbers.add(rd.nextInt(100));
        numbers.add(rd.nextInt(100));
        numbers.add(rd.nextInt(100));
        numbers.add(rd.nextInt(100));
        numbers.add(rd.nextInt(100));
        // imprimindo os numeros
        System.out.println(numbers);
        //ordenando a lista
        Collections.sort(numbers);
        //imprimindo a lista ordenada
        System.out.println(numbers);
    }
}
package Colecoes;

import java.util.LinkedList;

public class ExemploLinkedList {
    LinkedList <String> pessoas = new LinkedList<>();

    public void teste(){
        //adiciona normalmente
        pessoas.add("Pedro");
        pessoas.add("Maria");
        pessoas.add("João");
        System.out.println(pessoas + " - lista normal");
        //adiciona na primeira posição
        pessoas.addFirst("Cecília");
        System.out.println(pessoas + " - adicionado cecilia na primeira posição");
        //remove o último nome
        pessoas.removeLast();
        //imprimi a lista
        System.out.println(pessoas + " - removido o ultimo nome (joão)");
    }
    
}

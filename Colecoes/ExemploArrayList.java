package Colecoes;

import java.util.ArrayList;

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
    
}

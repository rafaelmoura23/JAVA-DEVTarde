package Colecoes;

import java.util.HashMap;

public class ExemploHashMap {
    HashMap<String,String> capitalEstado = new HashMap<>();
    HashMap<String,Integer> nomeIdade = new HashMap<>();

    public void teste(){
        //incluindo elementos na lista (Chave/Valor)
        capitalEstado.put("SP", "São Paulo");
        capitalEstado.put("RJ", "Rio de Janeiro");
        capitalEstado.put("MG", "Minas Gerais");
        capitalEstado.put("ES", "Vitória");
        //buscando um valor pela chave
        System.out.println(capitalEstado.get("ES"));
        //percorrer um hashmap
        for (String i : capitalEstado.keySet()) {
          System.out.println(i + ": " + capitalEstado.get(i));  
        }
    }

    public void exercicio1(){
        //incluindo os elementos na lista
        nomeIdade.put("Rafael", 19);
        nomeIdade.put("João", 20);
        nomeIdade.put("Maria", 16);
        nomeIdade.put("Mateus", 23);
        //buscando um valor pela chave
        System.out.println(nomeIdade.get("Rafael"));
        //percorrer um hashmap
        for (String i : nomeIdade.keySet()) {
            System.out.println(i + ": " + nomeIdade.get(i) + "anos");
        }
    }
}

package Colecoes;

import java.util.HashMap;

public class ExemploHashMap {
    HashMap<String,String> capitalEstado = new HashMap<>();

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
}

package Colecoes;

import java.util.HashMap;

public class ExemploHashMap {
    HashMap<String,String> capitalEstado = new HashMap<>();

    public void teste(){
        capitalEstado.put("SP", "São Paulo");
        capitalEstado.put("RJ", "Rio de Janeiro");
        capitalEstado.putIfAbsent("MG", "Minas Gerais");
        capitalEstado.put("ES", "Vitória");
        System.out.println(capitalEstado);
    }
}

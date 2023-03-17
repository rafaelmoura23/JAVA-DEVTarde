package CalculadoraDeDescontos;

public class App {
    public static void main(String[] args) {
        CalcularDesconto cDesconto = new CalcularDesconto();
        cDesconto.calcular();
        // cDesconto é o objeto.
        cDesconto.calcular30();
        // cDesconto é o objeto para desconto de 30%.
        cDesconto.calcular50();
    }
    
}

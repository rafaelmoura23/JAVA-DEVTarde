package CalculadoragastoViagem;

/**
 * CustoViagem
 */
public class CustoViagem {

    public static void main(String[] args) {
        System.out.println("CalculadoraGastoViagem ");
        double distanciaPercorrida=200;
        System.out.println(" A distância percorrida é " + distanciaPercorrida+"KM");
        double PrecoCombustivel=5;
        System.out.println(" O preço do combustivel é " + PrecoCombustivel+"R$");
        double consumoCarro=10;
        System.out.println(" O consumo do carro é " + consumoCarro +"KM/L");
        double gastoLitros = distanciaPercorrida/consumoCarro;
        System.out.println(" O gasto em litros é de " + gastoLitros +"L");
        double gastoTotal = gastoLitros*PrecoCombustivel;
        System.out.println(" O gasto total foi de " + gastoTotal +"R$");
 
    }
}
package POOInterface;

public class Trapezio implements FigurasGeometricas {
    //atributos do Trapezio
    int baseMenor;
    int baseMaior;
    int altura;
    int lado1;
    int lado2;

    //construtor
    public Trapezio(int baseMenor, int baseMaior, int altura, int lado1, int lado2) {
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //construtor vazio
    public Trapezio(){

    }

    //metodos @override
    @Override
    public double getArea() {
        return ((baseMaior+baseMenor)*altura)/2;
    }
    @Override
    public String getNomeFigura() {
        return "Trapézio";
    }

    @Override
    public double getPerimetro() {
        return lado1+lado2+baseMaior+baseMenor;
    }
}


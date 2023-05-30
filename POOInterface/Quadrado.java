package POOInterface;

public class Quadrado implements FigurasGeometricas{

    // assinou um contrato com figurasGeometricas
    //obrigatoriamente declarar os metodos da classe figuras geometricas

    //declarar atributos da classe Quadrado
    int lado;

    //construtor com parâmetros
    public Quadrado(int lado) {
        this.lado = lado;
    }
    
    //metodos importados de figurasGeometricas
    @Override
    public double getArea() {
        int area = lado*lado;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public double getPerimetro() {
        int perimetro = 4*lado;
        return perimetro;
    } 
    
}

package POOInterface;

public interface FigurasGeometricas {  
    //classe somente modelo para outras classes
    //não podemos instanciar objetos dessa classe, pois a classe iterface é abstrata por definição
    //métodos abstratos por padrão/default
    public String getNomeFigura();

    public double getArea();

    public double getPerimetro();
    
}

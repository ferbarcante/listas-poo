package lista04.entities;

public class Retangulo {
    private double x;
    private double y;
    private double largura;
    private double altura;

    public double area(){
        return altura*largura;
    }

    public double perimetro(){
        return 2 * altura + 2 * largura;
    }
}

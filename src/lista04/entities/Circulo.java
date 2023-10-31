package lista04.entities;

public class Circulo {
    private double x;
    private double y;
    private double raio;
    private double centro;

    public double perimetro(){
        return 2*Math.PI*raio;
    }

    public double area(){
        return Math.PI*Math.pow(raio, 2);
    }

}

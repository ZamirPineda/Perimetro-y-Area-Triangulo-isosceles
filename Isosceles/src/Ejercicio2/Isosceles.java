package Ejercicio2;
public class Isosceles {
    private double base;
    private double lado;

    public Isosceles(double base, double lado){
        this.base = base;
        this.lado = lado;
    }
    public double obtenerPerimetro(){
        double perimetro = 2*lado+base;
        return perimetro;
    }
    public double obtenerArea(){
        double area = (base*Math.sqrt((lado*lado) - ((base*base)/4)))/2;
        return area;
    }
}

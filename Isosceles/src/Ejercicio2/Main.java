package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static double mayorArea(Isosceles triangulos[]){
        double area;

        area = triangulos[0].obtenerArea();
        for(int i=1;i<triangulos.length;i++){
            if(triangulos[i].obtenerArea()>area){
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }
      public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base,lado;
        int nTriangulos;

        System.out.println("Digite el número de triangulos a ingresar: ");
        nTriangulos = entrada.nextInt();

        Isosceles triangulos[] = new Isosceles[nTriangulos];

        for(int i=0;i<triangulos.length;i++){
            System.out.println("\nDigite los valores del triangulo "+(i+1)+":");
            System.out.println("Introduzca la base: ");
            base = entrada.nextDouble();
            System.out.println("Introduzca el lado: ");
            lado = entrada.nextDouble();

            triangulos[i] = new Isosceles(base, lado);

            System.out.println("\nEl perimetro del triangulo es: "+triangulos[i].obtenerPerimetro());
            System.out.println("El area del triangulo es: "+triangulos[i].obtenerArea());
        }
        System.out.println("\nEl area del triangulo de mayor superficie es: "+mayorArea(triangulos));
    }
}

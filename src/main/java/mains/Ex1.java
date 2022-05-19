package mains;

import ex1.*;

public class Ex1 {
    public static void imprimirFiguras(FormaGeometrica forma) {
        System.out.println("AREA: "+forma.getArea());
        System.out.println("PERIMETRO: "+forma.getPerimetro());
    }
    
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        Triangulo triangulo = new Triangulo(3.8f, 4, 6.2f, 4);
        Retangulo retangulo = new Retangulo(10, 12.1f);
        Quadrado quadrado = new Quadrado(1.5f);
                
        circulo.calcularArea();
        circulo.calcularPerimetro();
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        quadrado.calcularArea();
        quadrado.calcularPerimetro();
                
        System.out.println("CIRCULO");
        imprimirFiguras(circulo);
        System.out.println("\nTRIANGULO");
        imprimirFiguras(triangulo);
        System.out.println("\nRETANGULO");
        imprimirFiguras(retangulo);
        System.out.println("\nQUADRADO");
        imprimirFiguras(quadrado);
    }
}
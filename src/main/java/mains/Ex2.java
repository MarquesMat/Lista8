package mains;

import ex2.*;
import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        Carro uno = new Carro("gasolina", 75);
        Carro flex = new Carro("diesel", 72.5f);
        Construcao shopping = new Construcao(1000, 2000, 25, false, true);
        Construcao escola = new Construcao(800, 1500, 40, true, true);
        Bicicleta adulto = new Bicicleta(20, 21, 12.5f);
        Bicicleta infantil = new Bicicleta(10, 3, 0.8f);
        
        ArrayList<CarbonFootprint> pegadas = new ArrayList<CarbonFootprint>();
        pegadas.add(uno);
        pegadas.add(flex);
        pegadas.add(shopping);
        pegadas.add(escola);
        pegadas.add(adulto);
        pegadas.add(infantil);
        
        
        System.out.println("RESUMO DE UMA SEMANA:");
        for (CarbonFootprint fonte: pegadas) {
            fonte.imprimirInfo();
        }
    }
}
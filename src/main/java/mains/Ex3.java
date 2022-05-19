package mains;

import ex3.*;
import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        Carro uno = new Carro("gasolina", 75);
        Carro flex = new Carro("diesel", 72.5f);
        Casa casa = new Casa(4, 8, false, true, 5);
        Escola escola = new Escola(1500, 900, true, true, 120);
        Bicicleta adulto = new Bicicleta(20, 21, 12.5f);
        Bicicleta infantil = new Bicicleta(10, 3, 0.8f);
        
        ArrayList<CarbonFootprint> pegadas = new ArrayList<>();
        //apresentou erro ao tentar instanciar uma classe abstrata, funcionou sem problema quando criei os construtores das subclasses
        pegadas.add(uno);
        pegadas.add(flex);
        pegadas.add(casa);
        pegadas.add(escola);
        pegadas.add(adulto);
        pegadas.add(infantil);
        
        System.out.println("RESUMO DE UMA SEMANA:");
        for (CarbonFootprint fonte: pegadas) {
            fonte.imprimirInfo();
        }
    }
}
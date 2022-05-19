package mains;

import ex4.Assalariado;
import ex4.PorHora;
import ex4.Comissionado;
import ex4.AssalariadoComissionado;

public class Ex4 {
    public static void main(String[] args) {
        Assalariado lucas = new Assalariado(1200);
        PorHora mariana = new PorHora(1000, 42);
        Comissionado julia = new Comissionado(5800);
        AssalariadoComissionado carlos = new AssalariadoComissionado(1150, 4100);
        
        System.out.println("---FOLHA DE PAGAMENTOS---");
        System.out.printf("PAGAMENTO DE Lucas: %.2f\n", lucas.calcularPagamento());
        System.out.printf("PAGAMENTO DE Mariana: %.2f\n", mariana.calcularPagamento());
        System.out.printf("PAGAMENTO DE Julia: %.2f\n", julia.calcularPagamento());
        System.out.printf("PAGAMENTO DE Carlos: %.2f\n", carlos.calcularPagamento());
    }
}

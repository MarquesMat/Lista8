package ex4;

public class PorHora extends Assalariado {
    public PorHora(double sal, int h) {
        super(sal);
        this.horas = h;
    }
    
    @Override
    public double calcularPagamento() {
        double extra = 0, taxa = 0;
        if (this.horas > JORNADA) {
            extra = this.horas - JORNADA;
            taxa = this.salario/JORNADA;
        }
        extra *= 1.5*taxa;
        return (this.salario + extra);
    }
}

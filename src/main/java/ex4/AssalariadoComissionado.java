package ex4;

public class AssalariadoComissionado extends Assalariado implements Comissao {
    public AssalariadoComissionado (double sal, double v) {
        super(sal);
        this.vendas = v;
    }
    
    public double recompensa() {
        return (this.salario *= 1.1);
    }

    @Override
    public double comissao() {
        return (this.vendas*0.30);
    }
    
    @Override
    public double calcularPagamento() {
        return (this.recompensa() + this.comissao());
    }
}

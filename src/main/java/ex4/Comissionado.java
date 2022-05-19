package ex4;

public class Comissionado extends Funcionario implements Comissao {
    public Comissionado (double v) {
        this.vendas = v;
    }
    
    @Override
    public double comissao() {
        return (this.vendas*0.30);
    }
    
    @Override
    public double calcularPagamento() {
        return this.comissao();
    }
}

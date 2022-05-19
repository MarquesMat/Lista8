package ex4;

public class Assalariado extends Funcionario {
    public Assalariado(double sal) {
        this.salario = sal;
    }
    
    @Override
    public double calcularPagamento() {
        return this.salario;
    }
}

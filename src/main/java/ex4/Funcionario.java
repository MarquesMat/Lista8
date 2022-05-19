package ex4;

public abstract class Funcionario {
    protected double salario, vendas;
    protected int horas;
    protected static final int JORNADA = 40;
    
    public abstract double calcularPagamento();
}

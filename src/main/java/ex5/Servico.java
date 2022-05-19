package ex5;

public class Servico implements Recebivel {
    private String descricao;
    private int horas;
    private double precoHora; 
    
    public void setDescicao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }
    
    @Override
    public double totalizarReceita() {
        return this.horas * this.precoHora;
    }
    
    @Override
    public void imprimirRegistros() {
        System.out.println("\nDESCRICAO: "+this.descricao);
        System.out.printf("PRECO: %d  x  %.2f\n", this.horas, this.precoHora);
    }
}

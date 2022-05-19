package ex5;

public class ItemVenda implements Recebivel {
    private String produto;
    private int quantidade;
    private double precoUnitario;
    
    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    @Override
    public double totalizarReceita() {
        return this.quantidade * this.precoUnitario;
    }
    
    @Override
    public void imprimirRegistros() {
        System.out.println("\nNOME: "+this.produto);
        System.out.printf("PRECO: %d  x  %.2f\n", this.quantidade, this.precoUnitario);
    }
}

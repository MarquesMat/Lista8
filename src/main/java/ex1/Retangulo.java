package ex1;

public class Retangulo extends FormaGeometrica {
    protected float lado1, lado2;
    
    public Retangulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    @Override
    public void calcularArea() {
        calcularArea(this.lado1, this.lado2);
    }
    
    public void calcularArea(float lado1, float lado2) {
        this.area = (lado1*lado2);
    }
    
    @Override
    public void calcularPerimetro() {
        calcularPerimetro(this.lado1, this.lado2);
    }
    
    public void calcularPerimetro(float lado1, float lado2) {
        this.perimetro = (2*lado1+2*lado2 );
    }
    
    @Override
    public float getArea() {
        return this.area;
    }
    
    @Override
    public float getPerimetro() {
        return this.perimetro;
    }
}

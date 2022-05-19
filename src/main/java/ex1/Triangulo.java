package ex1;

public class Triangulo extends FormaGeometrica {
    private float base, lado2, lado3, altura;
    
    public Triangulo(float base, float lado2, float lado3, float altura) {
        this.base = base;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        calcularArea(this.base, this.altura);
    }
    
    public void calcularArea(float base, float altura) {
        this.area = (this.base*this.altura/2);
    }
    
    @Override
    public void calcularPerimetro() {
        calcularPerimetro(this.base, this.lado2, this.lado3);
    }
    
    public void calcularPerimetro(float base, float lado2, float lado3) {
        this.perimetro = (base+lado2+lado3);
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

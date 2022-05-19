package ex1;

public class Circulo extends FormaGeometrica {
    private float raio;
    
    public Circulo(float raio) {
        this.raio = raio;
    }
    
    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    @Override
    public void calcularArea() {
        calcularArea(this.raio);
    }
    
    public void calcularArea(float raio) {
        this.area = (float)(Math.PI*raio*raio);
    }
    
    @Override
    public void calcularPerimetro() {
        calcularPerimetro(this.raio);
    }
        
    public void calcularPerimetro(float raio) {
        this.perimetro = (float)(2*Math.PI*raio);
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

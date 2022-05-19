package ex2;

public class Bicicleta implements CarbonFootprint {
    private int aro, marcha; //nao influenciam na pegada de carbono
    private float km;
    private static final float EMISSAOBIKE = 0.23f;
    
    public Bicicleta(int aro, int marcha, float km) {
        this.aro = aro;
        this.marcha = marcha;
        this.km = km;
    }
    
    @Override
    public float getCarbonFootprint() {
        return this.km*EMISSAOBIKE;
    }
    
    @Override
    public void imprimirInfo() {
        System.out.println("\n--BICICLETA--");
        System.out.println("ARO: "+this.aro);
        System.out.println("MARCHAS: "+this.marcha);
        System.out.println("DISTANCIA PERCORRIDA: "+this.km+" km");
        System.out.println("PEGADA DE CARBONO: "+this.getCarbonFootprint()+" kg CO2");
    }
}

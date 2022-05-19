package ex3;

public class Casa extends Construcao {
    private int horasChuveiro;
    private static final float EMISSAOCHUVEIRO = 0.015f;
    
    public Casa(int numP, int numL, boolean en, boolean ar, int horas) {
        super(numP, numL, en, ar);
        this.horasChuveiro = horas;
    }
    
    @Override
    public float getCarbonFootprint() {
        return super.getCarbonFootprint()+this.horasChuveiro*EMISSAOCHUVEIRO;
    }
    
    @Override
    public void imprimirInfo() {
        System.out.println("\n--CASA--");
        super.imprimirInfo();
        System.out.println("HORAS NO CHUVEIRO ELETRICO: "+this.horasChuveiro);
        System.out.println("PEGADA DE CARBONO: "+this.getCarbonFootprint()+" kg CO2");
    }
}

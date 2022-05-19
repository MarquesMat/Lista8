package ex3;

public class Escola extends Construcao {
    private int horasFrigorifico;
    private static final float EMISSAOFRIGORIFICO = 1.8f;
    
    public Escola(int numP, int numL, boolean en, boolean ar, int horas) {
        super(numP, numL, en, ar);
        this.horasFrigorifico = horas;
    }
    
    @Override
    public float getCarbonFootprint() {
        return super.getCarbonFootprint()+this.horasFrigorifico*EMISSAOFRIGORIFICO;
    }
    
    @Override
    public void imprimirInfo() {
        System.out.println("\n--ESCOLA--");
        super.imprimirInfo();
        System.out.println("HORAS DO FRIGORIFICO: "+this.horasFrigorifico);
        System.out.println("PEGADA DE CARBONO: "+this.getCarbonFootprint()+" kg CO2");
    }
}

package ex3;

public class Carro implements CarbonFootprint {
    private String combustivel;
    private float combustivelGasto;
    private static final float EMISSAOGASOLINA = 2.2755f, EMISSAODIESEL = 3.2f;
    
    public Carro(String combustivel,  float combustivelGasto) {
        this.combustivel = combustivel;
        this.combustivelGasto = combustivelGasto;
    }
    
    public void buzinar() {
        System.out.println("BI BI");
    }

    @Override
    public float getCarbonFootprint() {
        if (this.combustivel.equals("gasolina")) return this.combustivelGasto*EMISSAOGASOLINA;
        return this.combustivelGasto*EMISSAODIESEL;
    }
    
    @Override
    public void imprimirInfo() {
        System.out.println("\n--CARRO--");
        System.out.println("COMBUSTIVEL: "+this.combustivel);
        System.out.println("GASTO DE COMBUSTIVEL: "+this.combustivelGasto+" litros");
        System.out.println("PEGADA DE CARBONO: "+this.getCarbonFootprint()+" kg CO2");
    }
}

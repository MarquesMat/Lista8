package ex3;

public abstract class Construcao implements CarbonFootprint {
    protected int numPessoas, numLampadas;
    protected boolean energRenov, arCond;
    protected static final float EMISSAOPESSOA = 0.3f, EMISSAOLAMPADA = 0.25f;
    
    public Construcao(int numP, int numL, boolean en, boolean ar) {
        this.numPessoas = numP;
        this.numLampadas = numL;
        this.energRenov = en;
        this.arCond = ar;
    }
    
    @Override
    public float getCarbonFootprint() {
        float footprint = (this.numPessoas*EMISSAOPESSOA+this.numLampadas*EMISSAOLAMPADA);
        if (this.energRenov) footprint *= 0.75;
        if (this.arCond) footprint *= 1.5;
        return footprint;
    }
    
    @Override
    public void imprimirInfo() {
        System.out.println("NUMERO DE PESSOAS: "+this.numPessoas);
        System.out.println("NUMERO DE LAMPADAS: "+this.numLampadas);
        if (this.energRenov) System.out.println("USA ENERGIA RENOVAVEL");
        else System.out.println("NAO USA ENERGIA RENOVAVEL");
        if (this.arCond) System.out.println("POSSUI AR CONDICIONADO");
        else System.out.println("NAO POSSUI AR CONDICIONADO");
    }
}

package ex2;

public class Construcao implements CarbonFootprint {
    private int numPessoas, numLampadas, semAcidentes;
    private boolean energRenov, arCond;
    private static final float EMISSAOPESSOA = 0.3f, EMISSAOLAMPADA = 0.25f;
    
    public Construcao(int numP, int numL, int semA, boolean en, boolean ar) {
        this.numPessoas = numP;
        this.numLampadas = numL;
        this.semAcidentes = semA;
        this.energRenov = en;
        this.arCond = ar;
    }
    
    public void diaSemAcidente() {
        this.semAcidentes++;
    }
    
    public void acidente() {
        this.semAcidentes = 0;
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
        System.out.println("\n--CONSTRUCAO--");
        System.out.println("DIAS SEM ACIDENTES: "+this.semAcidentes);
        System.out.println("NUMERO DE PESSOAS: "+this.numPessoas);
        System.out.println("NUMERO DE LAMPADAS: "+this.numLampadas);
        if (this.energRenov) System.out.println("USA ENERGIA RENOVAVEL");
        else System.out.println("NAO USA ENERGIA RENOVAVEL");
        if (this.arCond) System.out.println("POSSUI AR CONDICIONADO");
        else System.out.println("NAO POSSUI AR CONDICIONADO");
        System.out.println("PEGADA DE CARBONO: "+this.getCarbonFootprint()+" kg CO2");
    }
}

package AulaExcecoes;

public class Aula {

    public static double calculadora(int x, int y) {
        return x/y;
    }
    
    public void teste() throws Excecao { //toda exceção verificada deve ser tratada ou delegada
        throw new Excecao();
    }
    
    public void teste2() throws Excecao { //exceção delegada, terá erro nas outras funções
        teste();
    }
    
    public void teste3() { //execeção tratada, não terá erro nas outras funções
        try {
            teste2();
        } catch (Excecao e){}
    }
    
    public void teste4() {
        teste3();
    }
    
    public static void main(String[] args) {
        try {
            double res;
            res = calculadora(2, 0);
            System.out.println(res);
        }
        catch (ArithmeticException e) {
            System.out.println("FIM DO PROGRAMA");
        }
    }
}

package ex5;

import java.util.Scanner;
import java.util.ArrayList;

public class RegistroRecebimentos {  
    public static void menu() {
        System.out.println("\n--MENU--");
        System.out.println("1 -> REGISTRAR SERVICO");
        System.out.println("2 -> REGISTRAR PRODUTO");
        System.out.println("3 -> IMPRIMIR REGISTROS");
        System.out.println("4 -> FECHAR PROGRAMA");
        System.out.print("\nEscolha uma opcao: ");
    }
    
    public static Servico registrarServico(Scanner teclado) {
        Servico servico = new Servico();
        teclado.nextLine();
        System.out.print("\nInforme a descricao do servico: ");
        servico.setDescicao(teclado.nextLine());
        System.out.print("Informe a duracao do servico: ");
        servico.setHoras(teclado.nextInt());
        System.out.print("Informe o preco da hora: ");
        servico.setPrecoHora(teclado.nextDouble()); //usar virgula no lugar de ponto
        return servico;
    }
    
    public static ItemVenda registrarItemVenda(Scanner teclado) {
        ItemVenda produto = new ItemVenda();
        teclado.nextLine();
        System.out.print("\nInforme o nome do produto: ");
        produto.setProduto(teclado.nextLine());
        System.out.print("Informe a quantidade do produto: ");
        produto.setQuantidade(teclado.nextInt());
        System.out.print("Informe o preco do produto: ");
        produto.setPrecoUnitario(teclado.nextDouble()); //usar virgula no lugar de ponto
        return produto;
    }
        
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Recebivel> registros = new ArrayList<Recebivel>();
        double receita = 0;
        int op;
        do {
            menu();
            op = teclado.nextInt();
            switch(op) {
                case 1 -> registros.add(registrarServico(teclado));
                case 2 -> registros.add(registrarItemVenda(teclado));
                case 3 -> {
                    System.out.println("\n--REGISTROS DE RECEBIMENTOS--");
                    for (Recebivel registro: registros) {
                        registro.imprimirRegistros();
                        receita += registro.totalizarReceita();
                    }
                    System.out.printf("\nRECEITA: %.2f\n", receita);
                    receita = 0; //zerar para não somar o mesmo valor mais de uma vez
                }
                case 4 -> System.out.println("\n--FIM DO PROGRAMA--");
                default -> System.out.println("\nOPCAO INVALIDA!");
            } 
        }while (op != 4);
    }
}

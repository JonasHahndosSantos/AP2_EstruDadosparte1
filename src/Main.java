import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila_Pedidos_Pendentes filaPedidos = new Fila_Pedidos_Pendentes();
        Pilha_Pedidos_Cancelados pilhaCancelados = new Pilha_Pedidos_Cancelados();
        String descricao = "";
        String pedido ="";


        int opcao;
        do {
            System.out.println("\nGESTÃO DE PEDIDOS");
            System.out.println("1. Adicionar Novo Pedido");
            System.out.println("2. Atender Pedido");
            System.out.println("3. Cancelar Pedido");
            System.out.println("4. Restaurar Pedido");
            System.out.println("5. Imprimir Pedidos Pendentes");
            System.out.println("6. Imprimir Pedidos Cancelados");
            System.out.println("0. Sair");
            System.out.print("O que você deseja fazer? ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("descrição do pedido:");
                    descricao = scanner.next();
                    filaPedidos.enfileirar(descricao);
                    System.out.println("pedido feito");
                    break;
                case 2:
                    filaPedidos.desenfileirar();
                    System.out.println("pedido atendido");
                    break;
                case 3:

                    pedido = (String) filaPedidos.desenfileirar();
                    pilhaCancelados.empilhar(pedido);
                    System.out.println("pedido cancelado");
                    break;
                case 4:
                    pilhaCancelados.desempilhar();
                    System.out.println("pedido restaurado");
                    break;
                case 5:
                    System.out.println("os pedidos pendentes são:");
                    filaPedidos.imprimirFila();
                    break;
                case 6:
                    System.out.println("os pedidos cancelados são:");
                    pilhaCancelados.imprimirPilha();
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);


        scanner.close();
    }




}
    

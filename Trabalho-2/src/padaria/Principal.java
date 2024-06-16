package padaria;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Padaria padaria = new Padaria();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1. Adicionar produto");
            System.out.println("2. Comprar produto");
            System.out.println("3. Vender produto");
            System.out.println("4. Listar produtos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    padaria.adicionarProduto(new Produto(nome, quantidade, preco));
                    break;
                case 2:
                    System.out.print("Nome do produto: ");
                    nome = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    quantidade = scanner.nextInt();
                    padaria.comprarProduto(nome, quantidade);
                    break;
                case 3:
                    System.out.print("Nome do produto: ");
                    nome = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    quantidade = scanner.nextInt();
                    padaria.venderProduto(nome, quantidade);
                    break;
                case 4:
                    padaria.listarProdutos();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}

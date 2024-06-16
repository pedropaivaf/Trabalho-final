// TRABALHO - 1
// Grupo: Pedro Paiva, João Hugo, Bernardo Ladeira, Denis Lima, Mateus Silva.
// Tema: Sistema de vendas Padaria

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Registrar Usuário");
            System.out.println("2. Comprar Produto");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    userService.registerUser();
                    break;
                case 2:
                    userService.buyProduct();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}

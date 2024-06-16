import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    private List<User> users = new ArrayList<>();

    public void registerUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String name = scanner.nextLine();

        System.out.print("Digite o email: ");
        String email = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String password = scanner.nextLine();

        User user = new User(name, email, password);
        users.add(user);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void buyProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String password = scanner.nextLine();

        User user = authenticateUser(email, password);
        if (user != null) {
            System.out.println("Produto comprado com sucesso!");
        } else {
            System.out.println("Falha na autenticação. Email ou senha incorretos.");
        }
    }

    private User authenticateUser(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}

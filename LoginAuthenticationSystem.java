import java.util.Scanner;

public class LoginAuthenticationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String storedUsername = "admin";
        String storedPassword = "password123";

        int attempts = 0;
        boolean authenticated = false;

        // Allow up to 3 login attempts using a loop.
        while (attempts < 3) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (storedUsername.equals(username) && storedPassword.equals(password)) {
                authenticated = true;
                break;
            } else {
                attempts++;
                System.out.println("Invalid credentials. Attempts left: " + (3 - attempts));
            }
        }

        if (authenticated) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Account locked after 3 failed attempts.");
        }
    }
}

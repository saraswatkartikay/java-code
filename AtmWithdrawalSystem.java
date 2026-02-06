import java.util.Scanner;

public class AtmWithdrawalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account balance: ");
        int balance = scanner.nextInt();
        System.out.print("Enter withdrawal amount: ");
        int withdrawal = scanner.nextInt();

        // Validate withdrawal conditions using logical AND.
        if (withdrawal % 100 == 0 && (balance - withdrawal) >= 1000) {
            balance -= withdrawal;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Withdrawal failed. Check amount or minimum balance.");
        }
    }
}

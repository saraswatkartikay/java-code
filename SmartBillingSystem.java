import java.util.Scanner;

public class SmartBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double total = price * quantity;
        double discountRate = 0.0;

        // Apply discount based on total bill using nested if-else.
        if (total >= 5000) {
            discountRate = 0.10;
        } else if (total >= 2000) {
            discountRate = 0.05;
        }

        double discountedAmount = total - (total * discountRate);
        double gst = discountedAmount * 0.18;
        double payable = discountedAmount + gst;

        System.out.printf("Final payable amount: %.2f%n", payable);
    }
}

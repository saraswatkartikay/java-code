import java.util.Scanner;

public class ElectricityBillGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = scanner.nextInt();

        double bill;
        // Calculate slab-wise charges using if-else ladder.
        if (units <= 100) {
            bill = units * 2.0;
        } else if (units <= 200) {
            bill = (100 * 2.0) + ((units - 100) * 3.0);
        } else {
            bill = (100 * 2.0) + (100 * 3.0) + ((units - 200) * 5.0);
        }

        bill += 150; // fixed meter charge
        System.out.printf("Total bill: %.2f%n", bill);
    }
}

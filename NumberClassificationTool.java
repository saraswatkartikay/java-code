import java.util.Scanner;

public class NumberClassificationTool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // Check positive or negative.
        if (n >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        // Check even or odd.
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Check divisibility by both 5 and 7.
        if (n % 5 == 0 && n % 7 == 0) {
            System.out.println("Divisible by both 5 and 7");
        } else {
            System.out.println("Not divisible by both 5 and 7");
        }
    }
}

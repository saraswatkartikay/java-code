import java.util.Scanner;

public class ReverseDigitAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        int value = Math.abs(n);
        int reverse = 0;
        int sum = 0;
        int count = 0;

        // Use while loop to reverse and analyze digits.
        while (value != 0) {
            int digit = value % 10;
            reverse = (reverse * 10) + digit;
            sum += digit;
            count++;
            value /= 10;
        }

        if (n < 0) {
            reverse = -reverse;
        }

        System.out.println("Reverse: " + reverse);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Count of digits: " + count);
    }
}

import java.util.Scanner;

public class SubtractWithoutMinus {
    // Adds two integers using bitwise operations.
    private static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    // Subtracts b from a by adding a and two's complement of b.
    private static int subtract(int a, int b) {
        int negB = add(~b, 1); // two's complement
        return add(a, negB);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers (a b): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = subtract(a, b);
        System.out.println("Difference: " + result);
    }
}

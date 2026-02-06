import java.util.Scanner;

public class MultiplyWithoutTimes {
    // Multiplies two integers using bit shifting and bitwise addition.
    private static int multiply(int a, int b) {
        int result = 0;
        int multiplicand = a;
        int multiplier = b;
        boolean negative = false;

        if (multiplicand < 0) {
            multiplicand = -multiplicand;
            negative = !negative;
        }
        if (multiplier < 0) {
            multiplier = -multiplier;
            negative = !negative;
        }

        while (multiplier != 0) {
            if ((multiplier & 1) == 1) {
                result = add(result, multiplicand);
            }
            multiplicand <<= 1;
            multiplier >>>= 1;
        }

        return negative ? -result : result;
    }

    // Adds two integers using bitwise operations.
    private static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = multiply(a, b);
        System.out.println("Product: " + result);
    }
}

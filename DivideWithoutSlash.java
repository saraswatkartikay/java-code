import java.util.Scanner;

public class DivideWithoutSlash {
    // Divides two integers using bit shifting and subtraction logic.
    private static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long quotient = 0;
        for (int shift = 31; shift >= 0; shift--) {
            if ((a >> shift) >= b) {
                a -= (b << shift);
                quotient |= (1L << shift);
            }
        }

        int result = (int) quotient;
        return negative ? -result : result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend and divisor: ");
        int dividend = scanner.nextInt();
        int divisor = scanner.nextInt();
        int result = divide(dividend, divisor);
        System.out.println("Quotient: " + result);
    }
}

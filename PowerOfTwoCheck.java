import java.util.Scanner;

public class PowerOfTwoCheck {
    // Checks power of two without loops or arithmetic operators by using bit count.
    private static boolean isPowerOfTwo(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
}

import java.util.Scanner;

public class PrimeRangeChecker {
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start and end: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println("Primes in range:");
        for (int n = start; n <= end; n++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}

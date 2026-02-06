import java.util.Scanner;

public class MaxWithoutComparison {
    // Finds max without comparison operators or conditionals using sign bit.
    private static int max(int a, int b) {
        int diff = a - b;
        int mask = diff >> 31; // -1 if a < b, 0 otherwise
        return a - (diff & mask);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = max(a, b);
        System.out.println("Max: " + result);
    }
}

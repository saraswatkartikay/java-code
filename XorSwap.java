import java.util.Scanner;

public class XorSwap {
    // Swaps two integers using XOR without a temporary variable.
    private static void swap(int[] values) {
        values[0] = values[0] ^ values[1];
        values[1] = values[0] ^ values[1];
        values[0] = values[0] ^ values[1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers (a b): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[] values = {a, b};
        swap(values);

        System.out.println("After swap: a=" + values[0] + ", b=" + values[1]);
    }
}

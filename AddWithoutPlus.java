import java.util.Scanner;

public class AddWithoutPlus {
    // Adds two integers using only bitwise operators.
    private static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b; // carry where both bits are 1
            a = a ^ b;         // sum without carry
            b = carry << 1;    // shift carry to next higher bit
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = add(a, b);
        System.out.println("Sum: " + result);
    }
}

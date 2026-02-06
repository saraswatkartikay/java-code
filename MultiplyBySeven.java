import java.util.Scanner;

public class MultiplyBySeven {
    // Multiplies by 7 using left shift and subtraction: (n << 3) - n.
    private static int multiplyBySeven(int n) {
        return (n << 3) - n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        System.out.println("Result: " + multiplyBySeven(n));
    }
}

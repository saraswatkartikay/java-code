import java.util.Scanner;

public class ParityCheck {
    // Determines even or odd using bitwise AND with 1.
    private static boolean isEven(int n) {
        return (n & 1) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        System.out.println(isEven(n) ? "Even" : "Odd");
    }
}

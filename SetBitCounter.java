import java.util.Scanner;

public class SetBitCounter {
    // Counts set bits using bitwise AND and right shifts.
    private static int countSetBits(int n) {
        int count = 0;
        int value = n;
        while (value != 0) {
            count += (value & 1);
            value >>>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        int count = countSetBits(n);
        System.out.println("Set bits: " + count);
    }
}

import java.util.Scanner;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basic = scanner.nextDouble();

        double hra;
        double da;

        // Decide HRA and DA based on basic salary.
        if (basic >= 30000) {
            hra = basic * 0.20;
            da = basic * 0.15;
        } else {
            hra = basic * 0.10;
            da = basic * 0.08;
        }

        double pf = basic * 0.12;
        double netSalary = basic + hra + da - pf;

        System.out.printf("Net salary: %.2f%n", netSalary);
    }
}

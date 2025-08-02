package DailyRoutine.Day1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal (P): ");
        double p = sc.nextDouble();

        System.out.print("Enter Time in years (T): ");
        double t = sc.nextDouble();

        System.out.print("Enter Rate of Interest (R): ");
        double r = sc.nextDouble();

        // Simple Interest = (P * T * R) / 100
        double si = (p * t * r) / 100;

        System.out.printf("Simple Interest = %.2f\n", si);

        sc.close();
    }
}

package DailyRoutine.Day2;

import java.util.Scanner;

public class Leapyear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        sc.close();
    }

    public static boolean isLeapYear(int year) {
        // Logic for leap year
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

package DailyRoutine.Day1;
import java.util.Scanner;
public class celsiusFarhen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        int c = sc.nextInt();
        double fahrenheit = (c * 9.0 / 5) + 32;
        System.out.println("Fahrenheit = " + fahrenheit);
        System.out.print("Enter temperature in Fahrenheit: ");
        int f = sc.nextInt();
        double celsius = (f - 32) * 5.0 / 9;
        System.out.println("Celsius = " + celsius);
        sc.close();
    }
}

package DailyRoutine.Day1;

import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter shape (square/rectangle/triangle): ");
        String s = sc.nextLine().toLowerCase();  // optional: to make case-insensitive

        switch (s) {
            case "square":
                System.out.print("Enter side length: ");
                int t = sc.nextInt();
                System.out.println("Area = " + (t * t));
                System.out.println("Perimeter = " + (4 * t));
                break;

            case "rectangle":
                System.out.print("Enter length: ");
                int l = sc.nextInt();
                System.out.print("Enter breadth: ");
                int b = sc.nextInt();
                System.out.println("Area = " + (l * b));
                System.out.println("Perimeter = " + (2 * (l + b)));
                break;

            case "triangle":
                System.out.print("Enter base: ");
                int a = sc.nextInt();
                System.out.print("Enter height: ");
                int h = sc.nextInt();
                System.out.println("Area = " + (0.5 * a * h));
                System.out.print("Enter side length (assuming equilateral): ");
                int side = sc.nextInt();
                System.out.println("Perimeter = " + (3 * side));
                break;

            default:
                System.out.println("Enter a valid shape (square, rectangle, triangle).");
        }

        sc.close();
    }
}

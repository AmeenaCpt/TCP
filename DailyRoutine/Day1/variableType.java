package DailyRoutine.Day1;

import java.util.Scanner;

public class variableType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Different variable types
        int number = 42;
        float decimal = 3.14f;
        double bigDecimal = 3.1415926535;
        char letter = 'A';
        boolean isJavaFun = true;
        String text = "Hello";

        System.out.println("int: " + number);
        System.out.println("float: " + decimal);
        System.out.println("double: " + bigDecimal);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + isJavaFun);
        System.out.println("String: " + text);

        sc.close();
    }
}

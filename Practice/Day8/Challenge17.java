package Practice.Day8;

import java.util.Scanner;

public class Challenge17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = sc.nextInt();
        System.out.println("Enter b value");
        int b = sc.nextInt();
        Child obj = new Child(a, b);
        System.out.println("Accessed from object: A = " + obj.a); // Optional
        sc.close();
    }
}

class Parent {
    int a;
    Parent(int a) {
        this.a = a;
    }
}

class Child extends Parent {
    int b;
    Child(int a, int b) {
        super(a);
        this.b = b;
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}

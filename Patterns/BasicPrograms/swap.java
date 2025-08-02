package Patterns.BasicPrograms;

public class swap {
    public static void swapping(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a is "+a+"and b is "+b);
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("a"+a+" "+"b"+b);
        swapping(a, b);
    }
}

package Patterns.BasicPrograms;

import java.util.Scanner;

public class oddEven{
    public static void number(int n){
        if(n%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        number(n);
        sc.close();
    }
}
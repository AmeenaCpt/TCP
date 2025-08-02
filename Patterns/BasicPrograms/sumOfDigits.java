package Patterns.BasicPrograms;

public class sumOfDigits {
    public static void sum(int n){
        int rem;
        int sum=0;
        while(n>0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("sum of digits is "+sum);
    }
    public static void main(String[] args) {
        int n=1234;
        sum(n);
    }
}

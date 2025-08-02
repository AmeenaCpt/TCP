package Patterns.BasicPrograms;

public class reverse {
    public static void number(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        System.out.println("reverse of a number is"+sum);
        
    }
    public static void main(String[] args) {
        int n=142;
        number(n);
    }
}

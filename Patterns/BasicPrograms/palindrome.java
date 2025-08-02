package Patterns.BasicPrograms;

public class palindrome {
    public static void number(int n){
        int temp=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(sum==temp){
            System.out.println(sum+" is palindrome");
        }
        else{
            System.out.println(sum+" not an palindrome ");
        }
    }
    public static void main(String[] args) {
        int n=141;
        number(n);
    }
}

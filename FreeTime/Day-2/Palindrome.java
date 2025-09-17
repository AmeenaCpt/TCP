import java.util.Scanner;

public class Palindrome {
    public static boolean solve(int n){
        int rev=0;
        int temp=n;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return (rev==temp) ? true:false;
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(solve(n));
        sc.close();
    }
}

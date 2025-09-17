import java.util.Scanner;

public class CountDigit{
    public static int solve(int n){
        int count=0;
        while(n!=0){
            int digit=n%10;
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(solve(n));
        sc.close();
    }
}
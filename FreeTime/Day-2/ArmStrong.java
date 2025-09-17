import java.util.Scanner;

public class ArmStrong {
    public static boolean solve(int n){
        int sum=0;
        int temp=n;
        while(n!=0){
            int digit=n%10;
            sum=sum+digit*digit*digit;
            n=n/10;
        }
        return (temp==sum)?true:false;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(solve(n));
        sc.close();
    }   
}

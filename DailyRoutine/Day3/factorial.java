package DailyRoutine.Day3;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of a Number is "+fact);
        sc.close();
    }
}

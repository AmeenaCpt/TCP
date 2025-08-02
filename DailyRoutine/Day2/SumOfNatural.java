package DailyRoutine.Day2;
import java.util.Scanner;
public class SumOfNatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum of Natural Numbers is "+sum);
        sc.close();
    }
}

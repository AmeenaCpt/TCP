package DailyRoutine.Day3;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit*digit*digit;
            n=n/10;
        }
        System.out.println(sum);
        if(temp==sum){
            System.out.println("Arm Strong Number");
        }else{
            System.out.println("Not an Arm Strong Number");
        }
        sc.close();
    }
}

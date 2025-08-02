package DailyRoutine.Day3;
import java.util.Scanner;
public class Palindrome {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum*10+digit;
            n=n/10;
        }
        System.out.println(sum);
        if(sum==temp){
            System.out.println("palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

        sc.close();
   } 
}

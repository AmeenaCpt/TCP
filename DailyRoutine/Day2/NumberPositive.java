package DailyRoutine.Day2;

import java.util.Scanner;

public class NumberPositive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Number is Positive");
        }else{
            System.out.println("Number is not positive");
        }
        sc.close();
    }
}

package DailyRoutine.Day3;

import java.util.Scanner;

public class fibSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=0;
        int n2=1;
        int n3;
        int n=sc.nextInt();
        int[] a={0};
        for(int i=2;i<=n;i++){
            n3=n1+n2;
            a[i]=n3;

        }
        for(int i=0;i<n;i++){
            System.out.println("Fibonnaci series is "+a);
        }
        
        sc.close();
    }
}

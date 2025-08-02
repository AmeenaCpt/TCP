package DailyRoutine.Day3;

import java.util.Scanner;

public class fibnocci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=0;
        int n2=1;
        int n3;
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            n3=n1+n2;
           System.out.println(n3+" ");
            n1=n2;
            n2=n3;
        }      
        sc.close();
    }
}

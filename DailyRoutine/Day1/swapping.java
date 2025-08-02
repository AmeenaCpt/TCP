package DailyRoutine.Day1;

import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("n1= "+n1+" "+"n2= "+n2);
        //int temp=n1;
        //n1=n2;
        //n2=temp;
        /*n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;*/
        n1 = n1 ^ n2;
        n2 = n1 ^ n2;
        n1 = n1 ^ n2;
        System.out.println("n1= "+n1+" "+"n2= "+n2);
        sc.close();
    }
}

package FreeTime.Day11Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static int display(int[] a){
        int n=a.length;
        int Smax=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                Smax=max;
                max=a[i];
            }else if(a[i]>Smax && a[i]<max){
                Smax=a[i];
            }
        }
        return Smax;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int s=display(a);
        System.out.println(s);
        sc.close();
    }
}

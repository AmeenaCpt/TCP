package FreeTime.Day11Arrays;

import java.util.Scanner;

public class LargestElement{
    public static int display(int[] a){
        int n=a.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
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
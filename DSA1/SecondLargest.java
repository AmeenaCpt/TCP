package DSA1;

import java.util.Scanner;

public class SecondLargest {
    public static void secondmax(int[] a){
        int n=a.length;
        int max=a[0];
        int second=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>max){
                second=max;
                max=a[i];
            }
        }
        System.out.println("Second Largest "+second);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(a[j-1]>a[j]){
                    temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
        secondmax(a);
        sc.close();
    }
}

package FreeTime.Practice;

import java.util.Scanner;

public class InsertionSort {
    public static void sort(int[] a){
        int n=a.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && a[j-1]>a[j]){
                int temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sort(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}

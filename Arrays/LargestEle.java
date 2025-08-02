package Arrays;

import java.util.Scanner;

public class LargestEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array values Are");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        largest(a);
        sc.close();
    }
    public static void largest(int[] a){
        int n=a.length;
        int min=0;
        for(int i=0;i<n;i++){
            if(a[i]>min){
                min=a[i];
            }
        }
        System.out.println("Largest Value is "+min);
    }
}

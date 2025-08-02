package Arrays;

import java.util.Scanner;

public class RemoveOccurence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter key to remove");
        int key=sc.nextInt();
        int[] temp=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]!=key){
                temp[j]=a[i];
                j++;
            }
        }
        System.out.print("[");
        for(int i=0;i<j;i++){
            System.out.print(temp[i]);
            if(i!=j-1){
                System.out.print(", ");
            }
            
        }
        System.out.println("]");
        sc.close();
    }
}

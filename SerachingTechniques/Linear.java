package SerachingTechniques;

import java.util.Scanner;

public class Linear {
    public static int  search(int[] a,int key){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[low]==key){
                System.out.println("Elemt found ");
                return mid;
            }else if(a[low]<key){
                low=mid+1;
            }else{
                low=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        search(a,key);
        sc.close();
    }
}

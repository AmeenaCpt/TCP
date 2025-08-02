package Practice.Day8;

import java.util.Scanner;

public class Challenge23 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Emter key element");
        int key=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(key==a[i]){
                count++;
            }
            if(count==2){
                break;
            }
        }
        System.out.println("Duplicate element Present");
        sc.close();
    }
}

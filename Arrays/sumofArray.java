package Arrays;
import java.util.Scanner;

public class sumofArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array is ");
        for(int i=0;i<n;i++){
            sum=sum+a[i];
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Sum of Array is"+sum);
        sc.close();
    }
}

package FreeTime.Day6;
import java.util.Scanner;
public class NumberHasing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] hash=new int[100000];
        for(int i=0;i<n;i++){
            hash[a[i]]++;
        }
        int q=sc.nextInt();
        int[] result=new int[q];
        for(int i=0;i<q;i++){
            int num=sc.nextInt();
            result[i]=hash[num];
        }
        for(int i=0;i<q;i++){
            System.out.println(result[i]);
        }
        sc.close();
    }
}
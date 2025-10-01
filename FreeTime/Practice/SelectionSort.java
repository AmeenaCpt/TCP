package FreeTime.Practice;
import java.util.Scanner;
public class SelectionSort {
    public static void sort(int[] a){
        int min=0;
        int n=a.length;
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
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

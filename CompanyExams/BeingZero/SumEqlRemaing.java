package CompanyExams.BeingZero;
import java.util.Scanner;
public class SumEqlRemaing {
    public static boolean solve(int[] a){
        int sum=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((a[i]+a[j])==sum-(a[i]+a[j])){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(solve(a));
        sc.close();
    }
}

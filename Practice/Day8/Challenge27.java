package Practice.Day8;
import java.util.Scanner;
public class Challenge27 {
    static void display(int[] a){
        for(int i=0;i<5;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        display(a);
        sc.close();
    }
}

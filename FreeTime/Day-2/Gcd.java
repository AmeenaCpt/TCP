import java.util.Scanner;

public class Gcd {
    public static int solve(int n1,int n2){
        while(n2!=0){
            int temp=n2;
            n2=n2%n1;
            n1=temp;
        }
        return n2;
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(solve(n1, n2));
        sc.close();
    }
}

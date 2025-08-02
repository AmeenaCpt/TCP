package DailyRoutine.Day2;
import java.util.Scanner;
public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int countE=0;
        int countO=0;
        for(int i=n;i<m;i++){
            System.out.print(i+" ");
            if(i%2==0){
                countE++;
            }else{
                countO++;
            }
        }
        System.out.println();
        System.out.println("Even Numbers Are"+countE);
        System.out.println("odd Numbers are"+countO);
        sc.close();
    }
}

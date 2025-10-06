package FreeTime.Day6;
import java.util.Scanner;
public class CharacterHasing1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] hash=new int[256];
        for (int i = 0; i < s.length(); i++) {
            //char c = s.charAt(i);
            hash[s.charAt(i)]++;
        }
        int q=sc.nextInt();
        int[] result=new int[q];
        for(int i=0;i<q;i++){
           char ch=sc.next().charAt(0);
           result[i]=hash[ch];
        }
        for(int i=0;i<q;i++){
            System.out.println(result[i]);
        }
        sc.close();
    }
}
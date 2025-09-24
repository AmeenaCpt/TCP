package FreeTime.Day6;
import java.util.Scanner;

public class CharacterHashing {
    public static void solve(String s,char ch){
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==ch){
                    count++;
                }
            }
        }
        System.out.println(count);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            char s1=sc.next().charAt(0);
            solve(s, s1);
        }
        sc.close();
    }
}

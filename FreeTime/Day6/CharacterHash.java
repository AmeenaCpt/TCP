package FreeTime.Day6;
import java.util.Scanner;
public class CharacterHash {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int q=sc.nextInt();
        int[] hash=new int[1000];
        for(int i=0;i<s.length();i++){
            hash[s[i]-'a']++;
        }
        int[] result=new int[q];
        for(int i=0;i<s.length();i++){
            char ch=sc.next().charAt(0);
            result[i]=hash[s[i]-'a'];
        }
        for(int i=0;i<q;i++){
            System.out.println(result[i]);
        }
    }
}

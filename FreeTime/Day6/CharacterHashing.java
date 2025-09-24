package FreeTime.Day6;
import java.util.Scanner;

public class CharacterHashing {
    public static void solve(String s, char ch) {
        int count = 0;
        int[] result=new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
            result[i]=count;
        }
        //System.out.println(count);
        for(int i=0;i<s.length();i++){
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();   // input string
        int q = sc.nextInt();   // number of queries

        for (int i = 0; i < q; i++) {
            char s1 = sc.next().charAt(0);
            solve(s, s1);
        }

        sc.close();
    }
}

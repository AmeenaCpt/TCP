package FreeTime.Day6;

import java.util.Scanner;

public class CharacterHash2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();  // input string
        int q = sc.nextInt();  // number of queries

        int[] hash = new int[256];  // supports all ASCII characters

        // count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hash[c]++;
        }

        // answer queries
        for (int i = 0; i < q; i++) {
            char ch = sc.next().charAt(0);
            System.out.println(hash[ch]);
        }

        sc.close();
    }
}

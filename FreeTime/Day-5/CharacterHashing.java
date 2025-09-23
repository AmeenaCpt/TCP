import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input string
        String s = sc.next();
        
        // Hash array for lowercase letters a-z
        int[] hash = new int[26];
        
        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        
        // Number of queries
        int q = sc.nextInt();
        
        // Answer queries
        while (q-- > 0) {
            char c = sc.next().charAt(0);
            System.out.println(hash[c - 'a']);
        }

        sc.close();
    }
}

package DSA1.Strings;

import java.util.Set;
import java.util.HashSet;

public class lengthOfLongestSubstring {
    public static int lengthOfSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            while (!set.add(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            max = Math.max(max, right - left + 1);
        }
        return max;

    }
    public static void testLongestSubstring() {
        System.out.println(lengthOfSubstring("abcabcbb"));  // 3
        System.out.println(lengthOfSubstring("bbbbb"));     // 1
        System.out.println(lengthOfSubstring("pwwkew"));    // 3
    }

    public static void main(String[] args) {
        testLongestSubstring();
    }
}

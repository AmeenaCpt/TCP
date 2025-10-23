package FreeTime.Practice;
import java.util.Set;
import java.util.HashSet;

public class LongestConsecutiveHashSet {
    public static int print(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            // check if num is the start of a sequence
            if (!set.contains(num - 1)) {
                int Cnum = num;
                int count = 1;

                // count consecutive numbers
                while (set.contains(Cnum + 1)) {
                    Cnum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] a = {100, 4, 200, 1, 3, 2};
        System.out.println(print(a)); // Output: 4 (sequence 1,2,3,4)
    }
}

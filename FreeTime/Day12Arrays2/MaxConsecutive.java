package FreeTime.Day12Arrays2;

public class MaxConsecutive {
    public static void display(int[] a) {
        int maxCount = 1;
        int count = 1;
        int maxNum = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    maxNum = a[i];
                }
            } else {
                count = 1;
            }
        }

        System.out.println("Number with maximum consecutive occurrence: " + maxNum);
        System.out.println("It occurs consecutively " + maxCount + " times");
    }

    public static void main(String args[]) {
        int[] a = {1, 1, 2, 1, 1, 1, 2, 3, 4};
        display(a);
    }
}

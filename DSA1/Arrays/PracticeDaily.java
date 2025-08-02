package DSA1.Arrays;
public class PracticeDaily {
    public static void moves(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public void PrintArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PracticeDaily obj = new PracticeDaily();
        int[] numbers = {0, 1, 0, 4, 12};

        System.out.println("Before moving zeros:");
        obj.PrintArray(numbers);

        moves(numbers);

        System.out.println("After moving zeros:");
        obj.PrintArray(numbers);
    }
}

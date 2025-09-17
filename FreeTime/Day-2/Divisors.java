import java.util.*;

public class Divisors {
    public static int[] solve(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        // Convert ArrayList to int[]
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] divisors = solve(n);

        // Option 1: Print using Arrays.toString
        System.out.println(Arrays.toString(divisors));

        // Option 2: Print one by one
        for (int d : divisors) {
            System.out.print(d + " ");
        }

        sc.close();
    }
}

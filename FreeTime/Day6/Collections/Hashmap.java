package FreeTime.Day6.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        int q = sc.nextInt();
        int[] result = new int[q];
        for (int i = 0; i < q; i++) {
            int num = sc.nextInt();
            result[i] = map.getOrDefault(num, 0);
        }
        for (int i = 0; i < q; i++) {
            System.out.println(i+"-->"+result[i]);
        }
        sc.close();
    }
}

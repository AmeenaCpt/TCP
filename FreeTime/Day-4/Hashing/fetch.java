import java.util.Scanner;

public class fetch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        //int maxVal = ...; // largest number in your input
        //int[] hash = new int[maxVal + 1];

        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0 && a[i] < 13) {
                hash[a[i]] += 1;
            }
        }
        int q = sc.nextInt();
        int[] results = new int[q]; 

        for (int i = 0; i < q; i++) {
            int number = sc.nextInt();
            if (number >= 0 && number < 13) {
                results[i] = hash[number];
            } else {
                results[i] = 0;
            }
        }

        // Print all results at the end
        for (int i = 0; i < q; i++) {
            System.out.println(results[i]);
        }

        sc.close();
    }
}

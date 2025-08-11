package wipro;
import java.util.*;

class Main {
    public static int countingValley(int n, String path) {
        int level = 0, valley = 0;
        for (int i = 0; i < n; i++) {
            char step = path.charAt(i);
            if (step == 'U') {
                level++;
            } else if (step == 'D') {
                if (level == 0) // start of a valley
                    valley++;
                level--;
            }
        }
        return valley;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String path = sc.next();
        
        if (path.length() != n) {
            System.out.println("Error: Path length does not match the number of steps.");
            return;
        }

        int result = countingValley(n, path);
        System.out.println(result);
    }
}

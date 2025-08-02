package DailyRoutine.Day1;

import java.util.Scanner;

public class seconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter total seconds: ");
        int s = sc.nextInt();
        
        int hours = s / 3600;
        int minutes = (s % 3600) / 60;
        int seconds = s % 60;
        
        System.out.println(s + " seconds is equal to " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");

        sc.close();
    }
}

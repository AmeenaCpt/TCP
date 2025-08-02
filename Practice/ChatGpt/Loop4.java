package Practice.ChatGpt;

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String choice;
        do{
            System.out.println("do you want to continue?(Y/N)");
            System.out.println("Welcome back");
             choice = sc.nextLine();
        }while(!choice.equalsIgnoreCase("N"));
        sc.close();
    }
}

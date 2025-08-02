package Practice.ChatGpt;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=90 ){
            System.out.println("Excellent");
        }else if(marks>=75 && marks<90){
            System.out.println("Good");
        }else if(marks>=50 && marks <75){
            System.out.println("Average");
        }else{
            System.out.println("Fail");
        }
        sc.close();
    }
}

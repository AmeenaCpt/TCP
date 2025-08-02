package Practice.Day8;

import java.util.Random;

public class Challenge4 {
    public static void main(String[] args) {
        Random r=new Random();
        int count=0;
        while(count<20){
            int x=r.nextInt(200);
            if(x>100){
                System.out.println(x);
                count++;
            }
        }
    }
}

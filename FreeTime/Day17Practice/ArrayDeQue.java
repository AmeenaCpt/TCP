package FreeTime.Day17Practice;

import java.util.ArrayDeque;

public class ArrayDeQue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        adq.add(1);
        adq.add(2);
        adq.add(3);
        System.out.println(adq);
        adq.push(4);
        adq.add(5);
        System.out.println(adq);    
    }
}

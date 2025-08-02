package Practice.Day8;

import java.util.ArrayList;

public class Challenge20 {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(2);
        a.add(20);
        a.add(2);
        a.add(30);
        a.add(2);
        int last=a.size()-1;
        a.remove(last);
        System.out.println(a);
        Integer i=2;
        a.remove(i);
        System.out.println(a);
    }
}

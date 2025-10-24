package FreeTime.Day17Practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        LinkedList<Integer> list1=new LinkedList<>();
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.addFirst(6);
        list1.addLast(10);
        System.out.print(list);
        System.out.println(list1);
    }
}

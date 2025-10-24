package FreeTime.Day17Practice;
import java.util.Set;
public class LinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set=new java.util.LinkedHashSet<>();
        set.add(1);
        set.add(3);
        set.add(3);
        set.add(2);
        System.out.println(set);

    }
}

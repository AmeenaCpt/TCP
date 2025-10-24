package FreeTime.Day17Practice;

import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicate {
    public static boolean print(int[] a){
        Set<Integer> set=new HashSet<>();
        for(int num:a){
            set.add(num);
        }
        for(int i:set){
            System.out.print(i+" ");
        }
        System.out.println();
        return true;
    }
    public static void main(String[] args) {
        int[] a={1,1,2,3,3,4,2,5};
        System.out.print(print(a));
    }
}

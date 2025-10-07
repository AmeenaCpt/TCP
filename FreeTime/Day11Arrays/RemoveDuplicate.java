package FreeTime.Day11Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicate {
    public static void display(int[] a){
        int n=a.length;
        Set<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            set.add(a[i]);
        }
        for(int num:set){
            System.out.println(num+" ");
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,2,3,4,4,5};
        display(a);
    }
}

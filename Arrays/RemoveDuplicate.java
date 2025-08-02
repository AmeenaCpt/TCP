package Arrays;
import java.util.*;
public class RemoveDuplicate{
    public static void main(String[] args) {
        int[] a={1,2,3,3,4,4,5};
        Set<Integer> set=new LinkedHashSet<Integer>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        System.out.println("Array after removing duplicates:");
        for(int num : set) {
            System.out.print(num + " ");
        }
        /*package Arrays;
import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 4, 4, 5};

        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        // Convert set to list for index-based access
        List<Integer> list = new ArrayList<>(set);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
 */
    }
}
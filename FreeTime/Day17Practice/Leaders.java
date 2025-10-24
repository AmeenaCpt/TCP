package FreeTime.Day17Practice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class Leaders {
    public static void  print(int[] a){
        List<Integer> list=new ArrayList<>();
        int n=a.length;
        int max=a[n-1];
        list.add(max);
        for(int num=n-2;num>=0;num--){
            if(a[num]>max){
                list.add(a[num]);
                max=a[num];
            }
        }
        Collections.reverse(list);
        System.out.println(list);

    }
    public static void main(String[] args) {
        int[] a={5,4,1,0,2};
        print(a);
    }
}

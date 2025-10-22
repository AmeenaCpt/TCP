package FreeTime.Day16;
import java.util.*;
public class Practice {
    public static List<Integer> print(int[] a){
        ArrayList<Integer> list=new ArrayList<>();
        int n=a.length;
        int maxLength=a[n-1];
        list.add(maxLength);
        for(int i=n-2;i>=0;i--){
            if(a[i]>maxLength){
                list.add(a[i]);
                maxLength=a[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        int[] a={5,3,1,0,2};
        print(a);
        
    }
}

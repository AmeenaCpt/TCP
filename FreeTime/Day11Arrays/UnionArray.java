package FreeTime.Day11Arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class UnionArray {
    public static void display(int[] a,int[] b){
        int n=a.length;
        Set<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            set.add(a[i]);
        }
        for(int j=0;j<b.length;j++){
            set.add(b[j]);
        }
        for(int num:set){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={2,3,5};
        display(a,b);
    }
}

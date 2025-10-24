package FreeTime.Day16;
import java.util.Set;
import java.util.HashSet;
public class LongestConsecutiveHashSet {
    public static void print(int[] a){
        Set<Integer> set=new HashSet<>();
        for(int num:a){
            set.add(num);
        }
        int longest=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int Cnum=num;
                int count=1;
                while(set.contains(Cnum+1)){
                    Cnum++;
                    count++;
                }
                longest=Math.max( longest,count);
            }
        }
        System.out.println(longest);
    }
    public static void main(String[] args) {
        int[] a={100,1,200,4,3,2};
        print(a);
    }
}
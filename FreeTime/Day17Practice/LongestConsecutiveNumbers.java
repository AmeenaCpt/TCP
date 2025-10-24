package FreeTime.Day17Practice;
import java.util.HashSet;
import java.util.Set;
public class LongestConsecutiveNumbers {
    public static boolean print(int[] a){
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
            }
            //longest=Math.max(count, longest);
        }
        System.out.println(longest);
        return true;
    }
    public static void main(String[] args) {
        int[] a={1,100,200,3,4,5};
        System.out.println(print(a));
    }
}

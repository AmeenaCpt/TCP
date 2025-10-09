package FreeTime.Day13ArraysMedium;
public class twoSum {
    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        int n=a.length;
        int target=3;
        for(int i=0;i<n-1;i++){
            if(a[i]+a[i+1]==target){
                System.out.println("["+i+","+(i+1)+"]");
            }
        }
    }
}

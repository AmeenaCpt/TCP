package FreeTime.Day11Arrays;

public class MissingNumber {
    public static int display(int[] a){
        int n=a.length+1;
        int total=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        return total-sum;
    }
    public static void main(String[] args) {
        int[] a={2,3,4,5};
        System.out.println(display(a));
    }
}

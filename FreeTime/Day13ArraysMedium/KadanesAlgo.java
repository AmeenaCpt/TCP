package FreeTime.Day13ArraysMedium;

public class KadanesAlgo {
    public static void main(String[] args) {
        int[] a={1,2,-2,-1,5,2};
        int n=a.length;
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
    }
}

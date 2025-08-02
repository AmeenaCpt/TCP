package Arrays;

public class removeOne {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int sum=0;
        for(int i=a.length-1;i>=0;i--){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}

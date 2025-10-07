package FreeTime.Day11Arrays;

public class LeftRotateArray {
    public static void display(int[] a){
        int n=a.length;
        int first=a[0];
        for(int i=0;i<n-1;i++){
            a[i]=a[i+1];
        }
        a[n-1]=first;
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a={5,4,32,1,1};
        display(a);
    }
}

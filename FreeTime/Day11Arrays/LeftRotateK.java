package FreeTime.Day11Arrays;

public class LeftRotateK {
    public static void display(int[] a,int k){
        int n=a.length;
        k=k%n;
        int[] temp=new int[n];
        int index=0;
        for(int i=k;i<n;i++){
            temp[index++]=a[i];
        }
        for(int j=0;j<k;j++){
            temp[index++]=a[j];
        }
        for(int i=0;i<n;i++){
            System.out.println(temp[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int k=3;
        display(a,k);
    }
}

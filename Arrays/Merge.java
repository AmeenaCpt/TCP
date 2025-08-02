package Arrays;
public class Merge {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={6,7,8,9,10};
        int n=a.length+b.length;
        int[] temp=new int[n];
        for(int i=0;i<a.length;i++){
            temp[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            temp[a.length+i]=b[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }
    }
}

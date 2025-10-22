package FreeTime.Day16;
public class NextPermutations {
    public static void next(int[] a){
        int n=a.length;
        int i=n-2;
        while(i>=0 && a[i]>=a[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(j>0 && a[j]<=a[i]){
                j--;
            }
            swap(a,i,j);
        }
        reverse(a,i+1,n-1);
    }
    private static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    private static void reverse(int[] a,int l,int r){
        while(l<r){
            swap(a, l++, r--);
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3};
        int n=a.length;
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+",");
        }
        System.out.print("]");
        System.out.println();
        next(a);
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+",");
        }
        System.out.print("]");
        System.out.println();
    }
}

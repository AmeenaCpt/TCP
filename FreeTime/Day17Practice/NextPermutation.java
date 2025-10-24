package FreeTime.Day17Practice;


public class NextPermutation {
    public static boolean print(int[] a){
        int n=a.length;
        int i=n-2;
        if(i>=0 && a[i]>=a[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(j>0 && a[j]<=a[i]){
                j--;
            }
            swap(a,i,j);
        }
        reverse(a,i++,n-1);
        System.out.println();
        return true;
    }
    private static void swap(int[] a,int i,int j){
        int t=a[i]=a[j];
        a[j]=a[i];
        a[j]=t;
    }
    private static void reverse(int[] a,int l,int r){
        while(l<r){
            swap(a, l++, r--);
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3};
        System.out.print(print(a));
    }
}

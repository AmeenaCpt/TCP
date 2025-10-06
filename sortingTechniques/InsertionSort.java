package sortingTechniques;
public class InsertionSort{
    public static void sort(int[] a){
        int n=a.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && a[j-1]>a[j]){
                int temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
        sort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
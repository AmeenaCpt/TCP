package sortingTechniques;
public class selectionSort{
    public static void sort(int[] a){
        int n=a.length;
        int min=0;
        for(int i=0;i<n-2;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
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


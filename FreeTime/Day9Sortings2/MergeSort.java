package FreeTime.Day9Sortings2;

public class MergeSort {
    public static void mergeSort(int[] a,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(a, left, mid);
            mergeSort(a, mid+1, right);
            merge(a,left,mid,right);
        }
    }
    public static void merge(int[] a,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] l=new int[n1];
        int[] r=new int[n2];
        for(int i=0;i<n1;i++){
            l[i]=a[left+i];
        }
        for(int j=0;j<n2;j++){
            r[j]=a[mid+1+j];
        }
        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(l[i]<=r[j]){
                a[k++]=l[i++];
            }else{
                a[k++]=r[j++];
            }
        } 
        while(i<n1){
            a[k++]=l[i++];
        }
        while(j<n2){
            a[k++]=r[j++];
        }
    }
    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
        mergeSort(a,  0, a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

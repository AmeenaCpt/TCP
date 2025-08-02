package Arrays;
public class CheckSort {
    public static void main(String[] args) {
        int[] a={1,2,3,6,5};
        boolean isSorted=false;
        for(int i=0;i<a.length-1;i++){
            if(a[i+1]<a[i]){
                isSorted=true;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is Not sorted");
        }else{
            System.out.println("Array Sorted");
        }
    }
}

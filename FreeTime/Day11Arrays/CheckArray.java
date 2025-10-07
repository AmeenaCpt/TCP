package FreeTime.Day11Arrays;

public class CheckArray {
    public static void display(int[] a){
        int n=a.length;
        boolean isSort=true;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                isSort= false;
                break;
            }
        }
        if(isSort){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is not Sorted");
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        display(a);
    }
}

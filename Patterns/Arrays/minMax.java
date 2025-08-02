package Patterns.Arrays;

public class minMax {
    public static void min(int[] arr){
        int n=arr.length;
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    public void PrintArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        minMax obj=new minMax();
        int[] numbers={2,1,4,5,3};
        obj.PrintArray(numbers);
        min(numbers);
        
    }
}

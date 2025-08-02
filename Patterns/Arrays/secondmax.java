package Patterns.Arrays;

public class secondmax {
    public static void second(int[] arr){
        int n=arr.length;
        int max=arr[0];
        int temp=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                temp=max;
                max=arr[i];
            }
        }
        System.out.print(temp);
    }
    public void PrintArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        secondmax obj=new secondmax();
        int[] numbers={2,4,1,5,7};
        obj.PrintArray(numbers);
        second(numbers);
    }
}

package Patterns.Arrays;
public class ReverseArray {
    public static void Reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void PrintArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        ReverseArray obj=new ReverseArray();
        int[] numbers={2,1,4,3};
        obj.PrintArray(numbers);
        Reverse(numbers,0,numbers.length-1);
        obj.PrintArray(numbers);
    }
}

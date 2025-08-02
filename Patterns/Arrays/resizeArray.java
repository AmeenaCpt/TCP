package Patterns.Arrays;

public class resizeArray {
    public int[] resize(int[] arr,int capacity){
        int[] temp=new int[capacity];
        int n=arr.length;
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        return temp;
    }
    public void PrintArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        resizeArray obj=new resizeArray();
        int[] numbers={5,1,2,9,10};
        System.out.println("the original array size " + numbers.length);
        numbers=obj.resize(numbers, 10);
        System.out.print("the resized array size is "+numbers.length);
    }
}

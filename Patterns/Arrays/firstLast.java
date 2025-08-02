package Patterns.Arrays;

public class firstLast {
    public void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==arr[0])
                System.out.println("First Index Value is "+arr[0]);
            if(arr[i]==arr[n-1])
                System.out.println("Last Index Value is "+arr[n-1]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        firstLast obj=new firstLast();
        int[] numbers={1,2,3,4,5};
        obj.printArray(numbers);
    }
}

package Patterns.Arrays;

public class missingNumber {
    public static int missing(int[] arr){
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        for(int num:arr){
            sum=sum-num;
        }
        return sum;
    }
    public void PrintArray(int[] arr){
        
        System.out.print(missing(arr));
    }
    public static void main(String[] args) {
        missingNumber obj=new missingNumber();
        int[] numbers={1,4,2,6,7,8,3};
        obj.PrintArray(numbers);
        
    }
}

package Patterns.Arrays;
public class commonTwo {
    public void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print("array is "+arr[i]);
            }
        System.out.println();
    }
    public static void main(String[] args) {
        commonTwo obj=new commonTwo();
        int[] num1={1,2,3,4,5};
        int[] num2={4,5,6,7,8};
        obj.printArray(num1);
        System.out.println("Second Array is ");
        obj.printArray(num2);
    }
}

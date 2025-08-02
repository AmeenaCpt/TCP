package Patterns.Arrays;
public class RemoveEven{

    public  void PrintArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]%2!=0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveEven obj = new RemoveEven(); 
        int[] numbers = {5,1,2,9,10};
        obj.PrintArray(numbers); 
    }
}

package DSA1.Arrays;
public class RemoveDuplicates {
    public void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
         boolean isDuplicate = false;

        for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;  
                }
            }
            
            if (!isDuplicate) {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        RemoveDuplicates obj=new RemoveDuplicates();
        int[] numbers={1,2,3,4,4,5};
        obj.printArray(numbers);
    }
}


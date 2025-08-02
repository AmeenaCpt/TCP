package Patterns.Arrays;

public class movesZeros {
    public static void moves(int[] arr){
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }
    public void PrintArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        movesZeros obj=new movesZeros();
        int[] numbers={0,1,0,4,12};
        obj.PrintArray(numbers);
        moves(numbers);
        obj.PrintArray(numbers);

    }
}

package DSA1.Arrays;

public class array {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int n=a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        //Reverse
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
        
    } 
}

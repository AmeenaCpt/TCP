package Practice.Day8;

public class Challenge22 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int i=0;
        int j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        System.out.println("Array in reverse order");
        for(int k=0;k<5;k++){
            System.out.print(a[k]+" ");
        }
        System.out.println();
    }
}

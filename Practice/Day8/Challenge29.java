package Practice.Day8;

public class Challenge29 {
    public static void main(String[] args) {
        int[] a={3,0,5,6,0,0,7,0,0,2,7,5};
        int n=a.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j=j+1;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}

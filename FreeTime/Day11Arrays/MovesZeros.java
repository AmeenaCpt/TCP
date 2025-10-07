package FreeTime.Day11Arrays;

public class MovesZeros {
    public static void display(int[] a){
        int n=a.length;
        int[] temp=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                temp[index++]=a[i];
            }
        }
        while(index<n){
            temp[index++]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a={0,2,1,0,3,4,0};
        display(a);
    }
}

package Arrays;

public class reverse {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length/2;j++){
                int temp=a[i][j];
                a[i][j]=a[i][a.length-1-j];
                a[i][a.length-1-j]=temp;
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

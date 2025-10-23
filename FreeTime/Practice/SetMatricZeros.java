package FreeTime.Practice;
import java.util.Arrays;
public class SetMatricZeros {
    public static void print(int[][] a){
        int m=a.length;
        int n=a[0].length;
        boolean[] row=new boolean[m];
        boolean[] col=new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i] || col[j]){
                    a[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix1 = {{1,1,1},{1,0,1},{1,1,1}};
        print(matrix1);
        System.out.println(Arrays.deepToString(matrix1));
    }
}

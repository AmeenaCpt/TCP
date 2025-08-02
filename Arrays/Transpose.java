package Arrays;
import java.util.Scanner;
public class Transpose {
    public static void trans(int[][] a,int[][] b){
        int n=a.length;
        int m=a[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[j][i]=a[i][j];
            }
        }
    }
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][] a=new int[n][m];
    int[][] b=new int[m][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=sc.nextInt();
        }
    }
    System.out.println();
    trans(a,b);
    sc.close();
    System.out.println("Transpose Of a Matrix is");
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print(b[i][j]+" ");
        }
        System.out.println();
    }

   } 
}

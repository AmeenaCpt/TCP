package CompanyExams.BeingZero;
import java.util.ArrayList;
import java.util.List;
public class MergeAndSort {
    public static List<Integer> solve(int n,int[] a,int m,int[] b){
        int len=n+m;
        int[] temp=new int[len];
        for(int i=0;i<n;i++){
            temp[i]=a[i];
        }
        for(int i=0;i<m;i++){
            temp[n+i]=b[i];
        }
        for(int i=0;i<temp.length-1;i++){
            for(int j=0;j<temp.length-1-i;j++){
                if(temp[j]>temp[j+1]){
                    int temp1=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp1;
                }
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<len;i++){
            list.add(temp[i]);
        }
        return list;
    }
    public static void main(String[] args) {
        int n=5;
        int[] a={4,2,1,5,3};
        int m=5;
        int[] b={9,6,8,7,0};
        List<Integer> result=solve(n, a, m, b);
        System.out.println(result);
    }
}

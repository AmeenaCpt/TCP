package Practice.Day8;
public class Challenge26 {
    public static void main(String[] args) {
        int[] a={11,23,45,76,87,39};
        int[] b={13,23,49,76,98,42};
        int n=6;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]==b[j]){
                    System.out.println(b[j]+" ");
                }
            }
        }
    }
}

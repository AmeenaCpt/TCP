package FreeTime.Day12Arrays2;
public class Practice {
    public static void main(String args[]){
        int[] a={1,2,3,5,6};
        int k=8;
        int maxLen=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum=sum+a[j];
                if(sum==k){
                    maxLen=Math.max(maxLen, j-i+1);
                }
            }
        }
        System.out.println(maxLen);
    }
}

package Practice.Day8;
public class Challenge21 {
    public static void main(String[] args) {
        int[] a={4,7,2,9,6,1,8};
        int max=0;
        for(int i=0;i<7;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}

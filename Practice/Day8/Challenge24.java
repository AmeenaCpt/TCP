package Practice.Day8;

public class Challenge24 {
    public static void main(String[] args) {
        int[] a={9,2,6,1,7,3,8,4,5};
        int key=10;
        for(int i=0;i<a.length-1;i++){
            for(int j=1;j<a.length-1;j++){
                if(a[i]+a[j]==key){
                    System.out.println("("+a[i]+","+a[j]+")");
                }
            }
        }
    }
}

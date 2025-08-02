package Practice.Day8;

public class Challenge25 {
    public static void main(String[] args) {
        int[] a={1,1,2,2,3,4,4,5,5};
        for(int i=0;i<a.length-1;i++){
            boolean isUnique=true;
            for(int j=0;j<a.length-1;j++){
                if(a[i]==a[j] && i!=j){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                System.err.println(a[i]);
            }
            
        }
        

    }
}

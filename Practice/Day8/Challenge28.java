package Practice.Day8;

public class Challenge28 {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        int[] b={10,20,30,90,50};
        boolean isequal=true;
        if(a.length!=b.length){
            isequal=false;
        }else{
            for(int i=0;i<a.length;i++){
                    if(a[i]!=b[i]){
                        isequal=false;
                        break;
                    }
            }
        }
        if(isequal){
            System.out.println("Two Arrays are Same");
        }else{
            System.out.println("Two Arrays are not same");
        }
    }
}

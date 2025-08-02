package Arrays;
public class CheckEqual {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={1,2,3,4,5};
        boolean isEqual=true;
        if(a.length==b.length){
            for(int i=0;i<a.length;i++){
                    if(a[i]!=b[i]){
                        isEqual=false;
                        break;
                    }
            }
        }else{
            isEqual=false;
        }
        if(isEqual){
            System.out.println("two Arrays are Equals");
        }else{
            System.out.println("Not equal");
        }
    }
}

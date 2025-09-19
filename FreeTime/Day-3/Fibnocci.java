public class Fibnocci {
    public static void print(int a,int b,int n){
        if(n==0) return;
        System.out.println(a+" ");
        print(b,a+b,n-1);
    }    
    public static void main(String[] args) {
        print(0,2,6);
    }
}

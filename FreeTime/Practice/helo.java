public class helo {
    public static int solve(int n){
        int a=0;
        int b=1;
        int c=0;
        for(int i=2;i<=n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(solve(5));
    }
}

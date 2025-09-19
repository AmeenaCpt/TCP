public class recursion {
    static int n=0;
    static void print(){
        if(n==11) return ;
        System.out.println(n);
        n=n+1;
        print();
    }
    public static void main(String[] args) {
        print();
    }
}

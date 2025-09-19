public class Factorial {
    static int fact=1;
    static int i=1;
    static void print(int n){
        if(i==n) return;
        fact=fact*i;
        i++;
        System.out.println(fact);
        print(n);
    }    
    public static void main(String[] args) {
        print(6);
    }
}

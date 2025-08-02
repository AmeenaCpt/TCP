package Patterns.BasicPrograms;

public class factorial {
    public static void number(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        int n=5;
        number(n);
    }
}

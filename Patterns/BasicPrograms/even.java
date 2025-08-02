package Patterns.BasicPrograms;

public class even {
    public static void number(int n){
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=100;
        number(n);
    }
}

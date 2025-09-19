public class Reverse {
    static int rem=0;

    static void print(int n){
        if(n==0) {
            System.out.println(rem); 
            return ;
        }
        int digit=n%10;
        rem=rem*10+digit;
        print(n/10);
        
    }    
    public static void main(String[] args) {
        print(123);
    }
}

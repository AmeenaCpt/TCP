public class NaturalNum {
     static int  n=1;
     static void print(int num){
        if(n==num) return;
        System.out.println(n);
        n++;
        print(num);
     }   
     public static void main(String[] args) {
        print(100);
     } 
}

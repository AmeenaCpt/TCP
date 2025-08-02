package Patterns.BasicPrograms;

public class odd {
    public static void number(int n){
        int sum=0;
        int count=0;
        for(int i=2;i<=n;i++){
            if(i==2){
                System.out.println(i);
            }
            if(i%2!=0){
                System.out.println(i);
                count++;
                sum=sum+i;
            }
        }
        System.out.println("sum of odd Numbers is"+sum);
        System.out.println("total no of odd numbers are"+count);
    }
    public static void main(String[] args) {
        int n=10;
        number(n);
    }
}

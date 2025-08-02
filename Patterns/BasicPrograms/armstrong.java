package Patterns.BasicPrograms;

public class armstrong {
    public static void arm(int n){
        int rem;
        int sum=0;
        int arg=n;
        for(int i=1;i<=n;i++){
            while(n>0){
                rem=n%10;
                sum=sum+(rem*rem*rem);
                n=n/10;
            }
        }
        if(arg==sum){
            System.out.println(arg+" is ArmStrong Number");
        }
        else{
            System.out.println(arg+"not an armStrong number");
        }
    }
    public static void main(String[] args) {
        int n=153;
        arm(n);

    }
}

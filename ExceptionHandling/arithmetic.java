package ExceptionHandling;
public class arithmetic {
    public static void main(String[] args) {
        int n1=9;
        int n2=0;
        int result=0;
        try{
            result=n1/n2;
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }finally{
            System.out.println("final");
        }
        System.out.println(result);
    }
}

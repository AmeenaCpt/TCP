package Practice.Day8;

public class Challenge19 {
    static Challenge19 c1;
    static {
        System.out.println("Welcome to static ");
        c1=new Challenge19();
        c1.foo();
    }
    void foo(){
        System.out.println("i am foo");
    }
    public static void main(String[] args) {
        System.out.println("welcome to main");
        c1.foo();
    }
}

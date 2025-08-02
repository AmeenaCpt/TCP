package Practice.Day8;
public class Challenge2 {
    public Challenge2(){
            System.out.println("First Constructor");
        }
        public Challenge2(int a){
            this();
            System.out.println("Second Constructor");
        }
        public Challenge2(int a,String s){
            this(2);
            System.out.println(a+s);
        }
    public static void main(String args[]){
        new Challenge2(21,"Ammi");
    }
}

public class name {
    static int n=1;
    static void print(){
        if(n==6) return ;
        System.out.println("AMINA");
        n++;
        print();
    }    
    public static void main(String[] args) {
        print();
    }
}

public class Tables {
    static int n=1;
    static int i=2;
    static void print(){
        if(n==11) return;
        System.out.println(i*n);
        n++;
        print();  
    }  
    public static void main(String[] args) {
        print();
    }  
}

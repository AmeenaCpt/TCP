package Oops.inheritance;

class Addition {
    int a,b;
    public void add(int x,int y){
        a=x;
        b=y;
        System.out.println("Addition of two numbers is"+(a+b));
    }
}
class B extends Addition{
    public void sum(int x,int y){
        add(x,y);
    }
    public static void main(String[] args) {
        B b1=new B();
        b1.sum(9, 10);
    }
}

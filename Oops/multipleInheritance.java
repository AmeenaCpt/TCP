package Oops;
interface A {
    void showA();
}
interface B {
    void showB();
}
class C implements A, B {
    public void showA() {
        System.out.println("A");
    }

    public void showB() {
        System.out.println("B");
    }
}
public class multipleInheritance{
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();  
        obj.showB();  
        A aRef = obj;
        B bRef = obj;
        aRef.showA();
        bRef.showB();
    }
}


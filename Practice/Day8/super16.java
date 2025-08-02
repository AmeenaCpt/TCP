package Practice.Day8;

class super16 {
    void methodA() {
        System.out.println("parent class");
    }
}

class classB extends super16 {
    void methodA() {
        super.methodA();  // Calls parent class method
        System.out.println("child class");
    }
}

class Main {
    public static void main(String[] args) {
        classB obj = new classB();
        obj.methodA();
    }
}

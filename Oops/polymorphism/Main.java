package Oops.polymorphism;
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }

    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}
class Dog extends Animal {
    void bark() {
        this.eat();
        System.out.println("Dog is barking!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();    
        myDog.sleep();  
        myDog.bark();   
    }
}
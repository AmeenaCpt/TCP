package Oops.inheritance;

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bow Bow");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow Meow");
    }
}

public class Pets {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();  // runtime polymorphism
        a.sound();      // prints "Bow Bow"

        a = new Cat();  // runtime polymorphism
        a.sound();      // prints "Meow Meow"
    }
}

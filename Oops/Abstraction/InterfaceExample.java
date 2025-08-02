package Oops.Abstraction;
interface Animal {
    void makeSound(); 
}
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.makeSound();

        Animal a2 = new Cat();
        a2.makeSound();
    }
}

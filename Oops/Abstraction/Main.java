package Oops.Abstraction;
abstract class RemoteControl {
    abstract void turnOn();
    abstract void turnOff();
}
class TVRemote extends RemoteControl {
    @Override
    void turnOn() {
        System.out.println("Turning on the TV...");
    }

    @Override
    void turnOff() {
        System.out.println("Turning off the TV...");
    }
}
public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();
    }
}

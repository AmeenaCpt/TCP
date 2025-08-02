package Oops.Abstraction;

public class practice {
    public static void main(String[] args) {
        RemoteControl r = new TvRemote();  // Fixed: TvRemote instead of TVRemote
        r.turnOff();
        r.turnOn();
    }
}

abstract class RemoteControl {
    abstract void turnOn();
    abstract void turnOff();
}

class TvRemote extends RemoteControl {
    @Override
    void turnOn() {
        System.out.println("Turning on Tv");
    }

    @Override
    void turnOff() {
        System.out.println("Turning off Tv");
    }
}

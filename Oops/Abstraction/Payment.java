package Oops.Abstraction;

abstract class PaymentMethod {
    abstract void pay(double amount);
    abstract String getMethodName(); 
}
class CreditCardPayment extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println(amount + " amount credited via Credit Card.");
    }
    @Override
    String getMethodName() {
        return "Credit Card";
    }
}
class UPIPayment extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println(amount + " amount credited via UPI.");
    }

    @Override
    String getMethodName() {
        return "UPI";
    }
}
public class Payment {
    public static void main(String args[]) {
        PaymentMethod p = new CreditCardPayment();
        p.pay(100);
        System.out.println("Payment Method: " + p.getMethodName());

        PaymentMethod p1 = new UPIPayment();
        p1.pay(2000);
        System.out.println("Payment Method: " + p1.getMethodName());
    }
}

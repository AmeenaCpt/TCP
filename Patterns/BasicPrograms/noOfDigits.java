package Patterns.BasicPrograms;

public class noOfDigits {
    public static void digits(int n) {
        int count = 0; 
        
        while (n > 0) {
            n = n / 10; 
            count++;      
        }
        
        System.out.println("Number of digits: " + count);
    }

    public static void main(String[] args) {
        int n = 1234;
        digits(n);
    }
}

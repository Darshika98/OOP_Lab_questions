package Question01;

public class DeliveryChargeTest {
    public static void main(String[] args) {
        // Create the calculator object [cite: 145]
        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        // Calling overloaded methods [cite: 146]
        System.out.println("Base Charge: " + calculator.calculateCharge(1000.0));
        System.out.println("With Distance: " + calculator.calculateCharge(1000.0, 5.0));
        System.out.println("With Weight: " + calculator.calculateCharge(1000.0, 5.0, 2.0));
        System.out.println("With Express: " + calculator.calculateCharge(1000.0, true));

        // This is compile-time polymorphism because the compiler decides which method 
        // to call based on the parameter list at compile time. [cite: 20, 148]
    }
}
package Question05;

public class Laptop extends ElectronicDevice implements Powerable {
    
    public Laptop(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " Laptop is powering on...");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + " Laptop is shutting down.");
    }

    @Override
    void displayDetails() {
        System.out.println("Device Type: Laptop, Brand: " + brand);
    }
}

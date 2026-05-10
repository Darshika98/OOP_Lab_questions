package Question05;

public class DeviceTest {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("HP");
        
        System.out.println("--- Electronic Device System ---");
        myLaptop.displayDetails();
        myLaptop.turnOn();
        myLaptop.turnOff();
    }
}
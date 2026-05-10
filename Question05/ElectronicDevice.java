package Question05;

abstract class ElectronicDevice {
    String brand;

    public ElectronicDevice(String brand) {
        this.brand = brand;
    }

    abstract void displayDetails();
}
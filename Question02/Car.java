package Question02;

public class Car extends Vehicle {
    @Override
    public void calculateRentalCost(int days) {
        double cost = days * 5000.0;
        System.out.println("Car Rental Cost for " + days + " days: Rs. " + cost);
    }
}
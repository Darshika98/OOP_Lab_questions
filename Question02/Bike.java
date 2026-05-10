package Question02;

public class Bike extends Vehicle {
    @Override
    public void calculateRentalCost(int days) {
        double cost = days * 1500.0;
        System.out.println("Bike Rental Cost for " + days + " days: Rs. " + cost);
    }
}
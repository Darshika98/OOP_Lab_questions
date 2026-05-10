package Question02;

public class VehicleRentalTest {
    public static void main(String[] args) {
        
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        
        myCar.calculateRentalCost(3); 
        myBike.calculateRentalCost(5); 
    }
}

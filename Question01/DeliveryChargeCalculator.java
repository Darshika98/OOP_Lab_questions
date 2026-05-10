package Question01;

public class DeliveryChargeCalculator {
    // Fixed rates as per lab sheet [cite: 131, 132, 133, 134]
    private final double DISTANCE_RATE = 100.0;
    private final double WEIGHT_RATE = 50.0;
    private final double EXPRESS_CHARGE = 500.0;

    // Overloaded methods [cite: 127]
    public double calculateCharge(double baseCharge) {
        return baseCharge;
    }

    public double calculateCharge(double baseCharge, double distanceKm) {
        return baseCharge + (distanceKm * DISTANCE_RATE);
    }

    public double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        return baseCharge + (distanceKm * DISTANCE_RATE) + (weightKg * WEIGHT_RATE);
    }

    public double calculateCharge(double baseCharge, boolean expressDelivery) {
        return expressDelivery ? baseCharge + EXPRESS_CHARGE : baseCharge;
    }
}
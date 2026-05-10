package Question03;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        // PI * r^2
        return Math.PI * radius * radius;
    }
}
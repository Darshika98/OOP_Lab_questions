package Question03;

public class ShapeTest {
    public static void main(String[] args) {
        // Interface එක variable වර්ගය ලෙස භාවිතා කිරීම (Polymorphism)
        Shape myCircle = new Circle(7.0);
        Shape myRectangle = new Rectangle(10.0, 5.0);

        System.out.println("--- Area Calculation ---");
        System.out.println("Area of Circle: " + myCircle.calculateArea());
        System.out.println("Area of Rectangle: " + myRectangle.calculateArea());
    }
}
public class Rectangle implements Shape {

    public final double side1, side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public double getPerimeter() {
        return 2*(side1*side2);
    }
}

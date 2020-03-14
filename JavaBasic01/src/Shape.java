public abstract class Shape {

    private double x,y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}

// interface의 접근제어자는 기본적으로 public이므로 따로 적어주지 않아도 된다.

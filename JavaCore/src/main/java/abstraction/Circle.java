package abstraction;

public class Circle extends Shape implements Drawable,ExtendAble{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {

    }

    @Override
    public void extend() {

    }
}

package Generic;

public class Square extends Shape{
    private int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width * width;
    }
}

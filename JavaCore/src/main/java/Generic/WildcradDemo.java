package Generic;

import java.util.LinkedList;
import java.util.List;

public class WildcradDemo {
    public static void main(String[] args) {
        // ?
        List<Shape> shapes = new LinkedList<>();
        shapes.add( new Circle(1));
        shapes.add( new Square(1));
        printSize(shapes);

        // ? extend T
        List<Circle> newShapes = new LinkedList<>();
        newShapes.add( new Circle(1));
        newShapes.add( new Circle(1));
        printArea(newShapes);

        // ? super T
    }
    public  static void printSize(List<?> shapes){
        System.out.println("shapes.size() = " + shapes.size());
    }

    public  static  void  printArea(List<? extends Shape> shapes){
        for (Shape shape : shapes){
            if (shape instanceof Circle){
                System.out.println("square = " + shape.area());
            }else {
                System.out.println("circle = " + shape.area());
            }
        }
    }

}

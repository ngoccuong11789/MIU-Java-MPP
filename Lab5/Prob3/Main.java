package Lab5.Prob3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(4, 5));
        shapes.add(new Triangle(4, 5));
        shapes.add(new Circle(2));

        double total = 0;
        for (Shape shape : shapes) {
            if(shape instanceof Rectangle) {
                System.out.println("Area of a rectangle :  " + shape.computeArea());
            } else if(shape instanceof Triangle) {
                System.out.println("Area of a triangle :  " + shape.computeArea());
            } else if(shape instanceof Circle) {
                System.out.println("Area of a circle :  " + shape.computeArea());
            }
            total += shape.computeArea();
        }
        System.out.printf("Total area = %.2f\n", total);

    }
}

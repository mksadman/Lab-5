import java.util.*;

public class ShapeOrderPrinter {
    public void orderShapes(List<Shape> shapes) {
        shapes.sort(Comparator.comparingDouble(Shape::calculateArea).thenComparingInt(Shape::getX).thenComparingInt(Shape::getY));
        for (Shape shape : shapes) {
            System.out.println("Shape Area: " + shape.calculateArea() + ", X: " + shape.getX() + ", Y: " + shape.getY());
            //System.out.println(shape.getClass().getSimpleName() + " " + shape.calculateArea() + " " + shape.getX() + " " + shape.getY());
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5, 2, 3));
        shapes.add(new Rectangle(4, 6, 1, 1));
        shapes.add(new Square(4, 3, 5));

        ShapeOrderPrinter printer = new ShapeOrderPrinter();
        printer.orderShapes(shapes);
    }
}

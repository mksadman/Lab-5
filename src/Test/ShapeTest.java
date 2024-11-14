package Test;

import org.junit.jupiter.api.Test;
import src.Circle;
import Rectangle;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ShapeTest {
    @Test
    public void testCircleArea(){
        Circle c = new Circle(5, 2, 3);
        assertEquals(Math.PI * Math.pow(5, 2), c.calculateArea());
    }
    @Test
    public void testRectangleArea(){
        Rectangle r = new Rectangle(4, 6, 1, 1);
        assertEquals(4 * 6, r.calculateArea());
    }
    @Test
    public void testSquareArea(){
        Square s = new Square(4, 3, 5);
        assertEquals(4 * 4, s.calculateArea());
    }
    @Test
    public void testCircleX(){
        Circle c = new Circle(5, 2, 3);
        assertEquals(2, c.getX());
    }
    @Test
    public void testRectangleX(){
        Rectangle r = new Rectangle(4, 6, 1, 1);
        assertEquals(1, r.getX());
    }
    @Test
    public void testSquareX(){
        Square s = new Square(4, 3, 5);
        assertEquals(3, s.getX());
    }
    @Test
    public void testShapeOrderPrinter(){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5, 2, 3));
        shapes.add(new Rectangle(4, 6, 1, 1));
        shapes.add(new Square(4, 3, 5));

        List<Shape> expected = new ArrayList<>(shapes);
        expected.sort(Comparator.comparingDouble(Shape::calculateArea).thenComparingInt(Shape::getX).thenComparingInt(Shape::getY));

        ShapeOrderPrinter printer = new ShapeOrderPrinter();
        printer.orderShapes(shapes);
    }

    @Test
    public void testShapeOrderPrinterSortingCriteria(){
        Shape s1 = new Rectangle(1,1,1,3);
        Shape s2 = new Square(1, 2, 2);
        Shape s3 = new Rectangle(1, 1, 1, 1);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(s1);
        shapes.add(s2);
        shapes.add(s3);

        List<Shape> expected = Arrays.asList(s3, s1, s2);
        ShapeOrderPrinter printer = new ShapeOrderPrinter();
        printer.orderShapes(shapes);

        assertEquals(expected, shapes);
    }

    @Test
    public void testShapeOrderPrinterWithEmptyList(){
        List<Shape> shapes = new ArrayList<>();

        ShapeOrderPrinter printer = new ShapeOrderPrinter();
        printer.orderShapes(shapes);
        assertTrue(shapes.isEmpty(), "List is empty");
    }

    @Test
    public void testShapeOrderPrinterWithNullShape(){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(null);
        ShapeOrderPrinter printer = new ShapeOrderPrinter();
        assertThrows(NullPointerException.class, () -> printer.orderShapes(shapes));
    }
}

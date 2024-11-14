public class Rectangle implements Shape{
    private double width, height;
    private int x, y;

    public Rectangle(double width, double height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public double calculateArea() {
        return width * height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

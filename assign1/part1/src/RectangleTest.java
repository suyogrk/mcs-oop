public class RectangleTest {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.setWidth(5);
        r1.setHeight(50);
        r1.setColor("yellow");

        System.out.println("Rectangle 1");
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Height: " + r1.getHeight());
        System.out.println("Color: " + r1.getColor());
        System.out.println("Area: " + r1.findArea());
        System.out.println("Perimeter: " + r1.findPerimeter());

        Rectangle r2 = new Rectangle(5, 50, "yellow");
        System.out.println();
        System.out.println("Rectangle 2");
        System.out.println("Width: " + r2.getWidth());
        System.out.println("Height: " + r2.getHeight());
        System.out.println("Color: " + r2.getColor());
        System.out.println("Area: " + r2.findArea());
        System.out.println("Perimeter: " + r2.findPerimeter());
    }
}

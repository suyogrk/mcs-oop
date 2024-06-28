package comparable;

public class GeometricTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);

        System.out.println(GeometricObject.max(circle1, circle2));

        Cylinder cylinder1 =  new Cylinder(10, 100);
        Cylinder cylinder2 =  new Cylinder(20, 200);

        System.out.println(GeometricObject.max(cylinder1, cylinder2));

        ComparableCylinder cc1 = new ComparableCylinder(10, 100);
        ComparableCylinder cc2 = new ComparableCylinder(20, 200);

        System.out.println(GeometricObject.max(cc1, cc2));

        Square square = new Square(100);
        square.howToColor();
    }
}

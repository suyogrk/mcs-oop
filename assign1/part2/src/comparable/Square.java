package comparable;

public class Square extends GeometricObject implements Colorable {
    protected double side;

    public Square(double side) {
        this.side = side;

        this.area = side * side;
    }

    @Override
    public void howToColor() {
       System.out.println("Color the square carefully");
    }
}

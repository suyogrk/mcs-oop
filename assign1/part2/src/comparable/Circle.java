package comparable;

public class Circle extends GeometricObject{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;

        this.area = Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString()
    {
        return "Radius: " + this.radius
                + "\nArea: " + this.area;
    }
}

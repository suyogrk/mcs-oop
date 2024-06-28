package comparable;

public class Cylinder extends GeometricObject {
    protected double height;
    protected double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;

        this.volume = Math.PI * radius * radius * height;
        this.area = 2 * Math.PI * radius * (radius + height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString()
    {
        return "Height: " + this.height
                + "\nRadius: " + this.radius
                + "\nVolume: " + this.volume
                + "\nArea: " + this.area;
    }
}

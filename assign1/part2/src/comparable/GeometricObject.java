package comparable;

public class GeometricObject implements Comparable<GeometricObject> {
    protected double volume;
    protected double area;

    public GeometricObject() {
        this.volume = 0;
        this.area = 0;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int compareTo(GeometricObject o) {
        if (this.area > o.area) {
            return 1;
        } else if (this.area == o.area) {
            return 0;
        } else {
            return -1;
        }
    }

    // Method to find the max of two GeometricObjects
    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
        if (obj1.compareTo(obj2) > 0) {
            return obj1;
        } else {
            return obj2;
        }
    }

    public String toString()
    {
        return  "Volume: " + this.volume
                + "\nArea: " + this.area;
    }
}

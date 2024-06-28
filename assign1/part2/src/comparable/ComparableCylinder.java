package comparable;

public class ComparableCylinder extends Cylinder implements Comparable<GeometricObject> {
    public ComparableCylinder(double height, double radius) {
        super(height, radius);
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (this.volume > o.volume) {
            return 1;
        } else if (this.volume == o.volume) {
            return 0;
        } else {
            return -1;
        }
    }
}

public class Fan {
    // Constants for fan speeds
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    //accessor and mutator for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed == SLOW || speed == MEDIUM || speed == FAST) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed. Use SLOW, MEDIUM, or FAST.");
        }
    }

    //accessor and mutator for on
    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    //accessor and mutator for radius
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    //accessor and mutator for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Fan Details " +
                "\nSpeed: " + this.speed +
                "\nOn: " + this.on +
                "\nRadius: " + this.radius +
                "\nColor: " + this.color;
    }
}

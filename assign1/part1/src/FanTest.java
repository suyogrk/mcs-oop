public class FanTest {
    public static void main(String[] args)
    {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        System.out.println(fan1);
    }
}

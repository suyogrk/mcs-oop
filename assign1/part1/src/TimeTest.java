public class TimeTest {
    public static void  main(String[] args)
    {
        Time time = new Time();

        System.out.println("Current time in GMT:");
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
    }
}

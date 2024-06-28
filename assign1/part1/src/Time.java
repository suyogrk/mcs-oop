import java.util.Calendar;
import java.util.TimeZone;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        long currentTime = System.currentTimeMillis();

        // Create a Calendar instance set to GMT time zone
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.setTimeInMillis(currentTime);

        // Set the hour, minute, and second fields
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }
}

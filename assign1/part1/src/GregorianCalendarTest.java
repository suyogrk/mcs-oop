import java.util.GregorianCalendar;

public class GregorianCalendarTest {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        System.out.println("Current Year: " + gregorianCalendar.get(GregorianCalendar.YEAR) );
        // add 1 to months because months are zero based
        System.out.println("Current Month: " + (gregorianCalendar.get(GregorianCalendar.MONTH) +  + 1));
        System.out.println("Current Day: " + gregorianCalendar.get(GregorianCalendar.DATE) );
    }
}

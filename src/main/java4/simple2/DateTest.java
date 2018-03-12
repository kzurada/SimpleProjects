package simple2;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(11, Month.APRIL, 1999);
        date1.printDate();
        Date date2 = new Date(29, Month.FEBRUARY, 2000);
        date2.printDate();
        Date date3 = new Date(29, Month.FEBRUARY, 2001);

        date3.printDate();
    }
}

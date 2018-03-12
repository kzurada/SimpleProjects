package simple2;

public class Date {
    private final int day;
    private final Month month;
    private final int year;

    public Date(int day, Month month, int year) {
        // jeśli przekazano niewłaściwy dzień, ustaw jakąś wartość domyślną (np. 1)
        // sprawdzamy czy dzień jest większy od 1 i mniejszy od maksymalnej ilości dni w danym miesiącu
        // lub czy jest to 29 lutego w roku przestępnym
        if (day >= 1 && day <= month.getMaxDays() || day == 29 && month.equals(Month.FEBRUARY) && year % 4 == 0) {
            this.day = day;
        } else {
            this.day = 1;
        }
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public Month getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public Season getSeason() {
        return this.month.getSeason();
    }

    public void printDate() {
        System.out.println("Date: " + getDay() +"/" + getMonth() + "/" + getYear() + ", " +  getSeason());
    }
}


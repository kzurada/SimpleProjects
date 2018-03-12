package simple2;

public enum Month {
    JANUARY(31, Season.WINTER), FEBRUARY(28, Season.WINTER), MARCH(31, Season.SPRING),
    APRIL(30, Season.SPRING), MAY(31, Season.SPRING), JUNE(30, Season.SUMMER),
    JULY(31, Season.SUMMER), AUGUST(31, Season.SUMMER), SEPTEMBER(30, Season.AUTUMN),
    OCTOBER(31, Season.AUTUMN), NOVEMBER(30, Season.AUTUMN), DECEMBER(31, Season.WINTER);

    private final int maxDays;
    private final Season season;

    Month(int maxDays, Season season) {
        this.maxDays = maxDays;
        this.season = season;
    }

    public int getMaxDays() {
        return maxDays;
    }

    public Season getSeason() {
        return season;
    }
}

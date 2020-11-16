public class Date {
    private int year;
    private int month;
    private int day;
    
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int timeUntilDay(int currentDay, int currentMonth, int currentYear){
        int time = ((currentDay * 30) + (currentMonth * 12) + currentYear) - ((day * 30) + (month * 12) + year);
        return time;
    }
}

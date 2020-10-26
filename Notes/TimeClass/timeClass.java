public class timeTester {
    //variables
    private int hour, minute, second = 0;
    private boolean isAM = true;
    
    //constructor
    public Time(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
        this.isAM = true;
    }

    public Time(int hour, int minute, int second, boolean isAM){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.isAM = isAM;
    }

    //Getters and setters
    public int getHour(){           //Getter
        return hour;
    }

    public void setHour(int hour){   //Setter
        if (hour >= 0 && hour <= 23)
            this.hour = hour;
    }
    
    //abilities

    public void display() {
       System.out.println(toString());
    }

    public String toString() {
        return this.hour + ":" + this.minute + ":" + this.second + ""(this.am ? "am" : "pm");
    }



}

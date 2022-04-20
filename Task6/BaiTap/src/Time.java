import java.sql.SQLOutput;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        if(h>=0 && h < 24) {
            this.hour = h;
        }else {
            this.hour = 0;
        }
        if(m>=0 && m < 60) {
            this.minute = m;
        }else {
            this.minute = 0;
        }
        if(s>=0 && s < 60) {
            this.second = s;
        }else {
            this.second = 0;
        }
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int h) {
        if(h>=0 && h < 24) {
            this.hour = h;
        }
    }
    public void setMinute(int m) {
        if(m>=0 && m < 60) {
            this.minute = m;
        }

    }
    public void setSecond(int s) {
        if(s>=0 && s < 60) {
            this.second = s;
        }
    }
    public void setTime(int h, int m, int s) {
        if(h>=0 && h < 24) {
            this.hour = h;
        }
        if(m>=0 && m < 60) {
            this.minute = m;
        }
        if(s>=0 && s < 60) {
            this.second = s;
        }
    }
    public String toString() {
        return "'" + hour + ":" + minute + ":" + second + "'";
    }
   public Time nextSecond() {
        if(second == 59 && minute == 59 && hour == 23) {
            setTime(0,0,0);
        }else if(second == 59 && minute == 59 ) {
            setTime(hour + 1, 0, 0);
        }else if(second == 59) {
            setTime(hour, minute + 1, 0);
        }else {
           second++;
        }
        return this;
   }
    public Time previousSecond() {
        if(second == 0 && minute == 0 && hour == 0) {
            setTime(23,59,59);
        }else if(second == 0 && minute == 0 ) {
            setTime(hour - 1, 59, 59);
        }else if(second == 0) {
            setTime(hour, minute - 1, 59);
        }else {
            second--;
        }
        return this;
    }

    public static void main(String[] args) {
        Time objTime = new Time(20, 45, 0);
        System.out.println("Hour: " + objTime.getHour());
        System.out.println("Minute: " + objTime.getMinute());
        System.out.println("Second: " + objTime.getSecond());
//        System.out.println("Time: " + objTime.nextSecond());
        System.out.println("Time: " + objTime.previousSecond());
    }
}

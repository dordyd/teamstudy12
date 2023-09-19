package Unit5_Exercise;

public class TimeOfDay {

    private int hour;
    private int minute;
    private int second;

    public TimeOfDay(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public boolean precedes(TimeOfDay timeOfDay) {
        if (this.hour < timeOfDay.hour) {
            return true;
        } else if (this.minute < timeOfDay.minute) {
            return true;
        } else if (this.second < timeOfDay.second) {
            return true;
        } else {
            return false;
        }
    }

    public void add(TimeOfDay timeOfDay) {
        this.minute += timeOfDay.minute;
        if (minute >= 60) {
            this.hour += 1;
            this.minute -= 60;
        }
    }

    public void subtract(TimeOfDay timeOfDay) {
        this.minute -= timeOfDay.minute;
        if (this.minute < 0) {
            this.hour -= 1;
            this.minute += 60;
        }
    }

    public boolean equalTo(TimeOfDay timeOfDay) {
        return this.hour == timeOfDay.hour && (this.minute == timeOfDay.minute) && (this.second == timeOfDay.second);
    }

    public String toString() {
        return this.hour + " : " + this.minute + " : " + this.second;
    }
}

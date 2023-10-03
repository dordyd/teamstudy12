public class Exercise07 {
private int day;
private int month;
private int year;

public Exercise07(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
}
public void setDate(Exercise07 ex){
System.out.println("ex.day"+" ex.month"+" ex.year");
    
}

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean isEqualTo(Exercise07 other) {
        return this.day == other.day && this.month == other.month && this.year == other.year;
    }

    public boolean isBefore(Exercise07 other) {
        if (this.year < other.year) {
            return true;
        } else if (this.year == other.year) {
            if (this.month < other.month) {
                return true;
            } else if (this.month == other.month) {
                return this.day < other.day;
            }
        }
        return false;
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
//31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    public Exercise07 nextDay() {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear()) {
            daysInMonth[2] = 29;
        }
        
        if (day < daysInMonth[month]) {
            return new Exercise07(day + 1, month, year);
        } else {
            if (month < 12) {
                return new Exercise07(1, month + 1, year);
            } else {
                return new Exercise07(1, 1, year + 1);
            }
        }
    }

@Override
    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }




    public static void main(String[] args) {
        Exercise07 date1 = new Exercise07(18, 9, 2023);
        Exercise07 date2 = new Exercise07(18, 9, 2023);
        Exercise07 date3 = new Exercise07(19, 9, 2023);

        
        System.out.println("Date 1 equal to Date 2: " + date1.isEqualTo(date2));
      
        System.out.println("Date 1 precedes Date 3: " + date1.isBefore(date3));


        System.out.println("Date 2 is a leap year: " + date2.isLeapYear());

        Exercise07 nextDayDate = date1.nextDay();
        System.out.println("Next day after Date 1: " + nextDayDate);
    }
}


    

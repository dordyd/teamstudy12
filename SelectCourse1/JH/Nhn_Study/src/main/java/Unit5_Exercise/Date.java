public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
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

    public boolean isEqual(Date other) {
        return (this.day == other.day && this.month == other.month && this.year == other.year);
    }

    public boolean isBefore(Date other) {
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

    public Date nextDay() {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear() && month == 2 && day == 28) {
            return new Date(29, month, year);
        }

        if (day < daysInMonth[month]) {
            return new Date(day + 1, month, year);
        } else {
            if (month < 12) {
                return new Date(1, month + 1, year);
            } else {
                return new Date(1, 1, year + 1);
            }
        }
    }

    public static void main(String[] args) {
        Date date1 = new Date(18, 9, 2023);
        Date date2 = new Date(19, 9, 2023);

        System.out.println("Date 1: " + date1.getDay() + "/" + date1.getMonth() + "/" + date1.getYear());
        System.out.println("Date 2: " + date2.getDay() + "/" + date2.getMonth() + "/" + date2.getYear());

        System.out.println("Date 1과 Date 2가 동일한가요? " + date1.isEqual(date2));
        System.out.println("Date 1이 Date 2보다 앞서나요? " + date1.isBefore(date2));
        System.out.println("Date 1의 연도가 윤년인가요? " + date1.isLeapYear());

        Date nextDate = date1.nextDay();
        System.out.println(
                "Date 1의 다음 날은 " + nextDate.getDay() + "/" + nextDate.getMonth() + "/" + nextDate.getYear() + "입니다.");
    }
}

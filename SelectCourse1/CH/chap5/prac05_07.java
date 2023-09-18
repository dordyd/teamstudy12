package SelectCourse1.CH.chap5;

public class prac05_07 {
    public static class Date {
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

        public boolean equals(Date that) {
            return (this.day == that.getDay()) && (this.month == that.getMonth()) && (this.year == that.getYear());
        }

        public boolean isLeapYear() {
            return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        }

        public boolean isPrecede(Date that) {
            if (this.month > that.getMonth()) {
                return true;
            }
            if (this.month == that.getMonth()) {
                return this.day > that.getDay();
            }
            return false;
        }

        public String nextDay() {
            int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            if (this.isLeapYear()) {
                months[1]++;
            }
            if (months[month - 1] == day) {
                return year + "." + (month + 1) + "." + 1;
            }
            return year + "." + month + "." + (day + 1);

        }
    }

    public static void main(String[] args) {
        Date date1 = new Date(28, 2, 2000);
        System.out.println(date1.isLeapYear());

        Date date2 = new Date(28, 2, 2000);
        System.out.println(date1.equals(date2));

        Date date3 = new Date(25, 4, 2000);
        System.out.println(date3.isPrecede(date1));

        Date date4 = new Date(29, 2, 2000);
        System.out.println(date1.nextDay());
        System.out.println(date4.nextDay());
        System.out.println(date1.getDay());
    }
}

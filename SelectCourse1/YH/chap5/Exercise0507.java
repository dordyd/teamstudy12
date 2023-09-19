package chap5;

public class Exercise0507 {
    public static class Date implements Comparable<Date>{
        private int day;
        private int month;
        private int year;

        public Date(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        public Date(){
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

        public boolean equalDate(Date date){
            return day == date.getDay() && year == date.getYear() && month == date.getMonth();
        }
        
        @Override
        public int compareTo(Date o) {
            if(getYear() == o.getYear()){
                if(this.getMonth() == o.getMonth()){
                    return this.getDay() - o.getDay();
                }
                else{
                    return this.getMonth() - o.getMonth();
                }
            }
            return this.getYear() - o.getYear();
        }

        public String largerDate(Date o){
            if(compareTo(o)>0){
                return "내가 더 큼";
            }
            else if( compareTo(o) == 0){
                return "둘이 같음";
            }
            else
                return "쟤가 더 큼";
        }
        public boolean leafYear(){
            if(getYear() % 4 == 0){
                if(getYear() % 100 != 0 || getYear() % 400 == 0){
                    return true;
                }
            }
            return false;
        }
        // 31 (28or29) 31 30 31 30 31 31 30 31 30 31
        public void nextDate(){
            int year = this.year;
            int month = this.month;
            int inputDay = day + 1;
            if( inputDay> 31 && month == 1){
                inputDay = inputDay - 31;
                month ++;
            }
            if(leafYear())
                if(inputDay > 29 && month == 2){
                    inputDay = inputDay - 29;
                    month ++;
                }
            else
                if(inputDay > 28 && month == 2){
                    inputDay = inputDay - 28;
                    month++;
                }
            if(inputDay > 31 && month == 3){
                inputDay = inputDay - 31;
                month ++;
            }
            if(inputDay > 30 && month == 4){
                inputDay = inputDay - 30;
                month ++;
            }
            if(inputDay > 31 && month == 5){
                inputDay = inputDay - 31;
                month ++;
            }if(inputDay > 30 && month == 6){
                inputDay = inputDay - 30;
                month ++;
            }if(inputDay > 31 && month == 7){
                inputDay = inputDay - 31;
                month ++;
            }if(inputDay > 31 && month == 8){
                inputDay = inputDay - 31;
                month ++;
            }if(inputDay > 30 && month == 9){
                inputDay = inputDay - 30;
                month ++;
            }if(inputDay > 31 && month == 10){
                inputDay = inputDay - 31;
                month ++;
            }if(inputDay > 30 && month == 11){
                inputDay = inputDay - 30;
                month ++;
            }if(inputDay > 31 && month == 12){
                inputDay = inputDay - 31;
                month =1;
                year++;
            }
            System.out.println(year + "년 " + month + "월 " + inputDay + "일");
        }
    }
    public static void main(String[] args) {
        Date date = new Date(10, 12, 5);
        Date date1 = new Date(11, 12, 5);
        System.out.println(date.largerDate(date1));
        Date date2 = new Date(31, 12, 10);
        date2.nextDate();
    }

    
}

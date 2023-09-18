public class Exercise_04 {

    public static boolean even(long x) {
       
        return (x % 2 == 0);
    }

    public static void main(String[] args) {
        long number = 18; 
        
        boolean isEven = even(number);


    if (isEven) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is not even.");
        }
    }

}

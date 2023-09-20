public class Ex02 {
    public static void main(String[] args) {
        int n = 5; 
        FirstNEven(n);
    }

    public static void FirstNEven(int n) {
      
        int count = 0;
        int number = 2; 

      

        while (count < n) {
            System.out.println(number);
            number += 2; 
            count++;
        }
    }
}
